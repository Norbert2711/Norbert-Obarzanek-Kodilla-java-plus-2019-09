package com.kodilla.good.patterns.challenges.food2Door;

import java.util.ArrayList;
import java.util.Map;

public interface FoodProducer {

    public boolean process(Customer customer, Map<Product, Integer> productData);
}
