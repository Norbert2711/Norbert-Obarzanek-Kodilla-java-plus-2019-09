package com.kodilla.good.patterns.challenges.shop;

import java.util.Objects;

public class Payment {

    private String card;
    private String paymentDescription;

    public Payment(String card, String paymentDescription) {

        this.card = card;
        this.paymentDescription = paymentDescription;
    }


    public String getCash() {
        return card;
    }

    public String getPaymentDescription() {
        return paymentDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return
                Objects.equals(card, payment.card) &&
                        Objects.equals(paymentDescription, payment.paymentDescription);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "card='" + card + '\'' +
                ", paymentDescription='" + paymentDescription + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(card, paymentDescription);
    }
}
