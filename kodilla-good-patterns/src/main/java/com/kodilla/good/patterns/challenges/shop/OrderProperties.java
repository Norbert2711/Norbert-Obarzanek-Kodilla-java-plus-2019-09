package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDate;
import java.util.Objects;

public class OrderProperties {
    User user;
    Product product;
    int quantity;
    LocalDate dateOfDelivery;
    Payment payment;
    Delivery delivery;

    public OrderProperties(Payment payment, Delivery delivery) {
        this.payment = payment;
        this.delivery = delivery;
    }

    public OrderProperties(User user, Product product, int quantity, LocalDate dateOfDelivery,
                           boolean productSolded) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.dateOfDelivery = dateOfDelivery;
    }

    public OrderProperties(User user, Product product, int quantity,
                           LocalDate dateOfDelivery, Delivery delivery,
                           Payment payment, boolean productSolded) {
    }

    public OrderProperties(User user, Product product, LocalDate dateOfDelivery, Payment payment, Delivery delivery) {
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(LocalDate dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderProperties that = (OrderProperties) o;
        return quantity == that.quantity &&
                Objects.equals(user, that.user) &&
                Objects.equals(product, that.product) &&
                Objects.equals(dateOfDelivery, that.dateOfDelivery) &&
                Objects.equals(payment, that.payment) &&
                Objects.equals(delivery, that.delivery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, product, quantity, dateOfDelivery, payment, delivery);
    }

    @Override
    public String toString() {
        return "OrderProperties{" +
                "user=" + user +
                ", product=" + product +
                ", quantity=" + quantity +
                ", dateOfDelivery=" + dateOfDelivery +
                ", payment=" + payment +
                ", delivery=" + delivery +
                '}';
    }
}
