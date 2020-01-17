package com.kodilla.good.patterns.challenges.food2Door;
import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements FoodProducer {

    public Map<Product, Integer> products;

    public HealthyShop(Map<Product, Integer> products) {
        this.products = products;
    }

    public HealthyShop() {

    }


    private Map<Product, Integer> createProductList() {

        Map<Product, Integer> products = new HashMap<>();

        products.put(new Product("Vitamin D3 + K2-MK7"),4);
        products.put(new Product("Xylitol Finnish"),8);
        products.put(new Product("Clarified Butter"),43);
        products.put(new Product("BIO coconut oil"),17);
        products.put(new Product("BIO millet"),6);
        products.put(new Product("Fluoride-free toothpaste"),32);

        return products;
    }
    @Override
    public boolean process(Customer customer, Map<Product, Integer> productData) {

        for (Map.Entry<Product, Integer> productPairHealthy: productData.entrySet()){

            if (productPairHealthy.getValue()<0){
                System.out.println("Please add product to Your order!");
                return false;
            }
            System.out.println("Your order is ready!");
        }

        return true;
    }
}
