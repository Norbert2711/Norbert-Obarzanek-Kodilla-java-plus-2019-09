package com.kodilla.good.patterns.challenges.shop;

public class ProductOrderService {      // ma miec juz koncowy wynik, czyli zlozone zamowienie. kto, co, czym, jak placi.


    private UserInformation userInformation;
    private CreateOrder createOrder;
    private ProductsSold productsSold;

    public ProductOrderService(UserInformation userInformation, CreateOrder createOrder,
                               ProductsSold productsSold) {
        this.userInformation = userInformation;
        this.createOrder = createOrder;
        this.productsSold = productsSold;
    }

    public OrderProperties process(OrderProperties orderProperties) {
        boolean productSolded = createOrder.readyOrderToSold
                (orderProperties.getUser(),
                        orderProperties.getProduct(),
                        orderProperties.getQuantity(),
                        orderProperties.getDateOfDelivery(),
                        orderProperties.getDelivery(),
                        orderProperties.getPayment());

        if (productSolded) {
            userInformation.aboutUser(orderProperties.getUser());
            productsSold.sold(orderProperties.getUser(),
                    orderProperties.getProduct(),
                    orderProperties.getQuantity(),
                    orderProperties.getDateOfDelivery(),
                    orderProperties.getDelivery(),
                    orderProperties.getPayment());

            System.out.println("Your order has been successfully created and is ready to send!");
        } else {
            System.out.println("Your order has been rejected by the system, try again!");
        }
        return new OrderProperties(orderProperties.getUser(),
                orderProperties.getProduct(),
                orderProperties.getQuantity(),
                orderProperties.getDateOfDelivery(),
                orderProperties.getDelivery(),
                orderProperties.getPayment(),
                productSolded);
    }
}
