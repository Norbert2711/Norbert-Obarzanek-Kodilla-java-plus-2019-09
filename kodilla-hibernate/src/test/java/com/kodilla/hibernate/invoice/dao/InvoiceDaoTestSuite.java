package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
@Autowired
    InoviceDao inoviceDao;
    @Test
    public void testInvoiceDaoSave() {

        //Given
        Invoice invoice1 = new Invoice("2345" );        //faktura
        //Invoice invoice2 = new Invoice("5642" );

        Product walther = new Product("P-99 Walther");
        Product handcuffs = new Product("Handcuffs");       //produkty
        Product tacticalVest = new Product("Tactical vest");
       // Product belt = new Product("Belt");

        Item itemWal = new Item(new BigDecimal(2500),new BigDecimal(56),5,walther);     //zamowienie
        Item itemHand = new Item(new BigDecimal(2000),new BigDecimal(327),49,handcuffs);
        Item itemTact = new Item(new BigDecimal(1500),new BigDecimal(33),25,tacticalVest);

        itemWal.setInvoice(invoice1);
        itemHand.setInvoice(invoice1);  //do zamowien dolaczona jest faktura
        itemTact.setInvoice(invoice1);

        List<Item> items = new ArrayList<>();       //lista z zamownieami
        items.add(itemWal);
        items.add(itemHand);
        items.add(itemTact);

        invoice1.setItems(items);       //faktura z lista

        //When
        inoviceDao.save(invoice1);
        int inoviceId = invoice1.getId();
        int itemSize = invoice1.getItems().size();

        //Then
        Assert.assertEquals(3, itemSize);
        Assert.assertEquals(0, inoviceId);
    }
}
