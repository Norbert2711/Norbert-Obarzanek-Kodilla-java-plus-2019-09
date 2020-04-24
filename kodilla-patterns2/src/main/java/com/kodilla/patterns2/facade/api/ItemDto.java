package com.kodilla.patterns2.facade.api;

public class ItemDto {

    private final Long productsId;
    private final double quantity;

    public ItemDto(Long productsId, double quantity) {
        this.productsId = productsId;
        this.quantity = quantity;
    }

    public Long getProductsId() {
        return productsId;
    }

    public double getQuantity() {
        return quantity;
    }
}
