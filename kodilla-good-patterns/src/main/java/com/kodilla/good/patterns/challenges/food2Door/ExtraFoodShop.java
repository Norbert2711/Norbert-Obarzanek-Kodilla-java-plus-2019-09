package com.kodilla.good.patterns.challenges.food2Door;
import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements FoodProducer {

    private Map<Product, Integer> products;

    public ExtraFoodShop(Map<Product, Integer> products) {
        this.products = products;
    }

    public ExtraFoodShop() {

    }

    private Map<Product, Integer> createProductList() {

        Map<Product, Integer> products = new HashMap<>();

        products.put(new Product("Bread"),4);
        products.put(new Product("Coffee"),5);
        products.put(new Product("Cheese"),23);
        products.put(new Product("Water"),7);
        products.put(new Product("Eggs"),87);
        products.put(new Product("Chocolate"),2);

        return products;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productData) {

        for (Map.Entry<Product, Integer> productPair: productData.entrySet()){

            if (productPair.getValue()<0){
                System.out.println("Please add product to Your order!");
                return false;
            }
            System.out.println("Your order is ready!");
        }

        return true;
    }

}
