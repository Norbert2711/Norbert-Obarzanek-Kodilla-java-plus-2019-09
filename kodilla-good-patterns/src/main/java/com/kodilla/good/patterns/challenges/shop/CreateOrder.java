package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDate;

public interface CreateOrder {
    boolean readyOrderToSold(User user, Product product, int quantity, LocalDate dateOfDelivery,
                             Delivery delivery, Payment payment);
}
