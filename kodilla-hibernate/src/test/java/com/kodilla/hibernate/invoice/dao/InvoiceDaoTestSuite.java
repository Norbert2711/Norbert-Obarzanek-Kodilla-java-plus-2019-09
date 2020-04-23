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

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Invoice invoice1 = new Invoice("2345");        //faktura
        //Invoice invoice2 = new Invoice("5642" );

        Product walther = new Product("P-99 Walther");
        Product handcuffs = new Product("Handcuffs");       //produkty
        Product tacticalVest = new Product("Tactical vest");
        // Product belt = new Product("Belt");

        //zamowienie
        Item itemWal = new Item(walther, new BigDecimal(56), 6);
        Item itemHand = new Item(handcuffs, new BigDecimal(2000), 49);
        Item itemTact = new Item(tacticalVest, new BigDecimal(1500), 25);

        itemWal.setInvoice(invoice1);
        itemHand.setInvoice(invoice1);  //do zamowien dolaczona jest faktura
        itemTact.setInvoice(invoice1);

        List<Item> items = new ArrayList<>();       //lista z zamownieami
        items.add(itemWal);
        items.add(itemHand);
        items.add(itemTact);

        invoice1.setItems(items);       //faktura z lista
        int id = invoice1.getId();
        //When
        invoiceDao.save(invoice1);
        int itemSize = invoice1.getItems().size();

        //Then
        Assert.assertEquals(3, itemSize);

        //CleanUp
        invoiceDao.delete(invoice1);
    }
}
