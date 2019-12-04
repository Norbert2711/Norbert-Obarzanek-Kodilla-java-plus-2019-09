package com.kodilla.stream.invoice.simple;

public class SimpleItem {

    private final SimpleProduct product;
    private final double quantity;

    public SimpleItem(SimpleProduct product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public SimpleProduct getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }
    double getValue(){
        return product.getProductPrice()* quantity;
    }
}
