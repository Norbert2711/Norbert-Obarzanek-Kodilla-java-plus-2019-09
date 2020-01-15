package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDate;

public class DataToTheCreatedOrder {

    public OrderProperties send() {

        User user = new User("Adam", "Małysz", "80- 020 Gdansk," +
                "ul. Dworcowa" + "4 mieszkania 3", 34);

        Product product = new Product("Konsola PS4",
                "Seria CUH-2000, Procesor: x86-64 AMD „Jaguar”," +
                        " 8 rdzeni " + "Karta graficzna: 1,84 TFLOPS, silnik graficzny AMD Radeon",
                2132.00);

        LocalDate dateOfDelivery = LocalDate.of(2020, 2,12);

        Payment payment = new Payment("Visa Master Card",
                " - the order was paid by card ");

        Delivery delivery = new Delivery("DPD courier",
                " - delivery by DPD courier within 5 business days" );

        System.out.println("Ready shipment details:");
        System.out.println("User: " + user +"."+ "Product: "+ product +"."+
                "Date od delivery: "+ dateOfDelivery+"."+"Payment method: "+ payment+"."+
                "Type of delivery: "+delivery+".");

return new OrderProperties(user,product,dateOfDelivery,payment,delivery);
    }


}
