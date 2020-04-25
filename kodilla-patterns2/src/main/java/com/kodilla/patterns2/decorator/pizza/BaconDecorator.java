package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BaconDecorator extends AbstractPizzaOrderDecorator {

    public BaconDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    public String getDescription() {
        return super.getDescription() + " + extra Bacon";
    }
}
