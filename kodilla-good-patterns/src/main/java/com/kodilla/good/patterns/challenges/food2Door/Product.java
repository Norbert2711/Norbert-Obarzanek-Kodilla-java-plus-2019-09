package com.kodilla.good.patterns.challenges.food2Door;

import java.util.Objects;

public class Product {

    private double productQuantity;
    private String typeOfProduct;

    public Product(double productQuantity, String typeOfProduct) {
        this.productQuantity = productQuantity;
        this.typeOfProduct = typeOfProduct;
    }

    public double getProductQuantity() {
        return productQuantity;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.productQuantity, productQuantity) == 0 &&
                Objects.equals(typeOfProduct, product.typeOfProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productQuantity, typeOfProduct);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productQuantity=" + productQuantity +
                ", typeOfProduct='" + typeOfProduct + '\'' +
                '}';
    }
}
