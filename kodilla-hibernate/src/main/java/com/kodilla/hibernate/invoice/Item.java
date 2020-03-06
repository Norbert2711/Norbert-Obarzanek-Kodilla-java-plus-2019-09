package com.kodilla.hibernate.invoice;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "PRODUCTS")
public class Item {
    private int id;
    private BigDecimal price;
    private BigDecimal value;
    int quantity;
    private Product product;
    private Invoice invoice;

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "INVOICE_ID", nullable = false)
    public Invoice getInvoice() {
        return invoice;
    }

    public Item(BigDecimal price, BigDecimal value, int quantity, Product product) {
        this.price = price;
        this.value = value;
        this.quantity = quantity;
        this.product = product;
    }

    public Item() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

