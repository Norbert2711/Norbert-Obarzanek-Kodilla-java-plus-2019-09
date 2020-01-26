package com.kodilla.good.patterns.challenges.food2Door;

import java.util.Map;
import java.util.Objects;

public class OrderRequest {
    //prośba o zamówienie, stworzone z zewnatrz, kto, co i stworzenie listy
    private Customer customer;
    private FoodProducer foodProducer;
    private Map<Product, Integer> listOfOrderProducts;

    OrderRequest(Customer customer, FoodProducer foodProducer, Map<Product, Integer> listOfOrderProducts) {
        this.customer = customer;
        this.foodProducer = foodProducer;
        this.listOfOrderProducts = listOfOrderProducts;
    }

    public Customer getCustomer() {
        return customer;
    }

    public FoodProducer getFoodProducer() {
        return foodProducer;
    }

    public Map<Product, Integer> getListOfOrderProducts() {
        return listOfOrderProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRequest that = (OrderRequest) o;
        return Objects.equals(customer, that.customer) &&
                Objects.equals(foodProducer, that.foodProducer) &&
                Objects.equals(listOfOrderProducts, that.listOfOrderProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, foodProducer, listOfOrderProducts);
    }
}
