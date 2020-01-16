package com.kodilla.good.patterns.challenges.food2Door;

public class GlutenFreeShop implements FoodProducer {
    @Override
    public boolean process(Customer customer, Product product) {
        return false;
    }
}
