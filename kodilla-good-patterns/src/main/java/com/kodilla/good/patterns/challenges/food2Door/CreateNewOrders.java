package com.kodilla.good.patterns.challenges.food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateNewOrders {

    List<OrderRequest> order() {

        List<OrderRequest> createNewOrder = new ArrayList();

        Customer customer1 = new Customer("Adam Malysz");
        FoodProducer extraFoodShop = new ExtraFoodShop();
        Map<Product, Integer> extraFoodShopProductList = new HashMap<>();
        extraFoodShopProductList.put(new Product("Coffee"), 3);
        extraFoodShopProductList.put(new Product("Water"), 23);
        extraFoodShopProductList.put(new Product("Eggs"), 36);

        createNewOrder.add(new OrderRequest(customer1,extraFoodShop,extraFoodShopProductList));

        Customer customer2 = new Customer("Tobiasz Murawski");
        FoodProducer glutenFreeShop = new GlutenFreeShop();
        Map<Product, Integer> glutenFreeShopProductList = new HashMap<>();
        glutenFreeShopProductList.put(new Product("gluten- free Flour"),10);
        glutenFreeShopProductList.put(new Product("gluten- free Pasta"),2);
        glutenFreeShopProductList.put(new Product("gluten- free Mayonnaise"),9);
        glutenFreeShopProductList.put(new Product("gluten- free Biscuits"),19);

        createNewOrder.add(new OrderRequest(customer2,glutenFreeShop,glutenFreeShopProductList));

        Customer customer3 = new Customer("Agata Nugat");
        FoodProducer healthyShop = new HealthyShop();
        Map<Product, Integer> healthyShopProductList = new HashMap<>();
        healthyShopProductList.put(new Product("Xylitol Finnish"),7);
        healthyShopProductList.put(new Product("Clarified Butter"),41);
        healthyShopProductList.put(new Product("BIO coconut oil"),7);
        healthyShopProductList.put(new Product("Vitamin D3 + K2-MK7"),2);
        healthyShopProductList.put(new Product("Fluoride-free toothpaste"),3);

        createNewOrder.add(new OrderRequest(customer3,healthyShop,healthyShopProductList));

        return createNewOrder;
    }
}
