package com.kodilla.good.patterns.challenges.food2Door;

import java.util.List;

public class SendingTheOrder {

    private void sendingAllOrders(List<OrderRequest> allReadyOrders) {

        allReadyOrders.stream()
                .map(n -> {
                    System.out.println("Your order has been accepted for processing! Dear Customer: " + n.getCustomer().getCustomerName());
                    return n.getFoodProducer().process(n.getCustomer(), n.getListOfOrderProducts());
                })
                .forEach(t -> System.out.println("Order finished with success: " + t));
    }
}



