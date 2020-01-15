package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDate;

public class MyLittleShop {

    public static void main(String[] args) {


        DataToTheCreatedOrder dataToTheCreatedOrder = new DataToTheCreatedOrder();
        OrderProperties orderProperties = dataToTheCreatedOrder.send();

ProductOrderService productOrderService = new ProductOrderService(new UserInformation() {
    @Override
    public void aboutUser(User user) {

    }
},
        new CreateOrder() {
            @Override
            public boolean readyOrderToSold(User user, Product product, int quantity, LocalDate dateOfDelivery, Delivery delivery, Payment payment) {
                return false;
            }
        }, new ProductsSold() {
    @Override
    public boolean sold(User user, Product product, int quantity, LocalDate dateOfDelivery, Delivery delivery, Payment payment) {
        return false;
    }
});

productOrderService.process(orderProperties);
    }

}
