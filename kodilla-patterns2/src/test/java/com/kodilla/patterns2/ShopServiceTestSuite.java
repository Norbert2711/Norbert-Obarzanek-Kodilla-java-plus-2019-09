package com.kodilla.patterns2;

import com.kodilla.patterns2.facade.ShopService;
import com.kodilla.patterns2.facade.api.ItemDto;
import com.kodilla.patterns2.facade.api.OrderDto;
import com.kodilla.patterns2.facade.api.OrderFacade;
import com.kodilla.patterns2.facade.api.OrderProcessingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ShopServiceTestSuite {

    @Autowired
    private ShopService shopService;

    @Autowired
    private OrderFacade orderFacade;

    @Test
    public void testShopFacade(){

        OrderDto order = new OrderDto();
        order.addItem(new ItemDto(10L, 2));
        order.addItem(new ItemDto(216L,1));
        order.addItem(new ItemDto(25L, 1));
        order.addItem(new ItemDto(11L,13));
        try {
            orderFacade.processOrder(order, 1L);
        }catch (OrderProcessingException e) {
            // facade :) code here
        }
    }
}
