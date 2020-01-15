package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDate;

public interface ProductsSold {

    boolean sold(User user, Product product, int quantity, LocalDate dateOfDelivery, Delivery delivery, Payment payment);
}
