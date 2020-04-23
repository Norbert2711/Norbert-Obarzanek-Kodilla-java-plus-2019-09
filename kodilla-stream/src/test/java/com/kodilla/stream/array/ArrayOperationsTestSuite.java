package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {21, 3, 5, 6, 0, 7, 6, 4, 8, 1, 3, 7, 14, 6, 8, 5, 3, 8, 5, 10};  //sum 130
        double resultAverage = 6.5;

        //When
        double average = ArrayOperations.getAverage(numbers);
        System.out.println("Result Average: " + average);
        //Then
        Assert.assertEquals(resultAverage, average, 0.0001);

    }
}

