package com.kodilla.patterns2;

import org.junit.Test;

import com.kodilla.patterns2.facade.api.ItemDto;
import com.kodilla.patterns2.facade.api.OrderDto;
import com.kodilla.patterns2.facade.api.OrderProcessingException;

public class ShopServiceTestSuite {

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
            // efssgg
        }
    }
}
