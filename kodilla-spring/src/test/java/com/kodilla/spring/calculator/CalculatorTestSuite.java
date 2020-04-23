package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(2.0, 8.0);
        double sub = calculator.sub(22.0, 10.0);
        double mul = calculator.mul(3.0, 3.0);
        double div = calculator.div(15.0, 3.0);

        //Then
        Assert.assertEquals(10.0, add, 001);
        Assert.assertEquals(12.0, sub, 001);
        Assert.assertEquals(9.0, mul, 001);
        Assert.assertEquals(5.0, div, 001);

    }
}
