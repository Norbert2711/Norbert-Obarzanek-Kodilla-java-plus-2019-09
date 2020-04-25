package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        //When
        BigDecimal pizzaCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(15), pizzaCost);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        //When
        String pizzaDescription = theOrder.getDescription();
        //Then
        Assert.assertEquals("Basic pizza", pizzaDescription);
    }

    @Test
    public void testBasicPizzaWithBasicIngredientsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new BasicIngredients(theOrder);
        //When
        BigDecimal pizzaCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(20), pizzaCost);
    }

    @Test
    public void testBasicPizzaWithBasicIngredientsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new BasicIngredients(theOrder);
        //When
        String pizzaDescription = theOrder.getDescription();
        //Then
        System.out.println(pizzaDescription);
        Assert.assertEquals("Basic pizza + ingredients (salami, mushrooms, bacon, pepper, cheese)", pizzaDescription);
    }

    @Test
    public void testBasicPizzaWithBasicIngredientsAndExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new BasicIngredients(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        //When
        BigDecimal pizzaCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(30), pizzaCost);
    }

    @Test
    public void testBasicPizzaWithBasicIngredientsAndExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new BasicIngredients(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        //When
        String pizzaDesc = theOrder.getDescription();
        //Then
        System.out.println(pizzaDesc);
        Assert.assertEquals("Basic pizza + ingredients (salami, mushrooms, bacon, pepper, cheese) + extra Cheese", pizzaDesc);
    }

    @Test
    public void testBasicPizzaWithBasicIngredientsAndExtraCheeseAndExtraBaconGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new BasicIngredients(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);
        //When
        BigDecimal pizzaCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(40), pizzaCost);
    }

    @Test
    public void testBasicPizzaWithBasicIngredientsAndExtraCheeseAndExtraBaconGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new BasicIngredients(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);
        //When
        String pizzaDesc = theOrder.getDescription();
        //Then
        System.out.println(pizzaDesc);
        Assert.assertEquals("Basic pizza + ingredients (salami, mushrooms, bacon, pepper, cheese) + extra Cheese + extra Bacon", pizzaDesc);
    }
}
