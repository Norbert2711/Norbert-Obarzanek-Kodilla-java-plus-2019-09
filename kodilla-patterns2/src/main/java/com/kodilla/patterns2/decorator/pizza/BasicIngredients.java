package com.kodilla.patterns2.decorator.pizza;


import java.math.BigDecimal;

public class BasicIngredients extends AbstractPizzaOrderDecorator {

    public BasicIngredients(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }
    public String getDescription() {
        return super.getDescription() + " + ingredients (salami, mushrooms, bacon, pepper, cheese)";
    }
}
