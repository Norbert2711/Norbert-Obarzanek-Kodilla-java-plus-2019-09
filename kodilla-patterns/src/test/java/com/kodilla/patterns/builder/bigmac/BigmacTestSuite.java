package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testMakeDreamBurger(){

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesame roll")
                .burgers(8)
                .sauce("Garlic sauce")
                .ingredient("Onion")
                .ingredient("Cheese")
                .ingredient("Bacon")
                .ingredient("Tomato")
                .ingredient("Pickled cucumber")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(5, howManyIngredients);

    }
}
