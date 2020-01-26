package com.kodilla.good.patterns.challenges.shop;

import java.util.Objects;

public class Product {

    private String name;
    private String productDescription;
    private double price;

    public Product(String name, String productDescription, double price) {
        this.name = name;

        this.productDescription = productDescription;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return
                Double.compare(product.price, price) == 0 &&
                        Objects.equals(name, product.name) &&
                        Objects.equals(productDescription, product.productDescription);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, productDescription, price);
    }
}
