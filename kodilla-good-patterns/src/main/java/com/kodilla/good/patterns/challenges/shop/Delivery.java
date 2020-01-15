package com.kodilla.good.patterns.challenges.shop;

import java.util.Objects;

class Delivery {

    String dpd;
    String deliveryDescription;

    public Delivery(String dpd,  String deliveryDescription) {
        this.dpd = dpd;

        this.deliveryDescription = deliveryDescription;

    }

    @Override
    public String toString() {
        return "Delivery{" +
                "dpd='" + dpd + '\'' +
                ", deliveryDescription='" + deliveryDescription + '\'' +
                '}';
    }

    public String getDpd() {
        return dpd;
    }

    public String getDeliveryDescription() {
        return deliveryDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return Objects.equals(dpd, delivery.dpd) &&
                Objects.equals(deliveryDescription, delivery.deliveryDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dpd, deliveryDescription);
    }
}
