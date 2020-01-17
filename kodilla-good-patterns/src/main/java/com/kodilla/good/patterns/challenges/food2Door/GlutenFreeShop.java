package com.kodilla.good.patterns.challenges.food2Door;
import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements FoodProducer {

    public Map<Product, Integer> products;

    public GlutenFreeShop(Map<Product, Integer> products) {
        this.products = products;
    }

    public GlutenFreeShop() {

    }

    private Map<Product, Integer> createProductList() {

        Map<Product, Integer> products = new HashMap<>();

        products.put(new Product("gluten- free Oatmeal"),12);
        products.put(new Product("gluten- free Flour"),15);
        products.put(new Product("gluten- free Rice drink"),27);
        products.put(new Product("gluten- free Pasta"),9);
        products.put(new Product("gluten- free Mayonnaise"),55);
        products.put(new Product("gluten- free Biscuits"),44);

        return products;
    }
    @Override
    public boolean process(Customer customer, Map<Product, Integer> productData) {

        for (Map.Entry<Product, Integer> productPairGluten: productData.entrySet()){

            if (productPairGluten.getValue()<0){
                System.out.println("Please add product to Your order!");
                return false;
            }
            System.out.println("Your order is ready!");
        }

        return true;
    }
}
