package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        numbers[0] = 6;
        numbers[1] = 3;
        numbers[2] = 6;
        numbers[3] = 2;
        numbers[4] = 2;
        numbers[5] = 6;
        numbers[6] = 8;
        numbers[7] = 2;
        numbers[8] = 1;
        numbers[9] = 3;
        numbers[10] = 2;
        numbers[11] = 4;
        numbers[12] = 2;
        numbers[13] = 6;
        numbers[14] = 2;
        numbers[15] = 9;
        numbers[16] = 7;
        numbers[17] = 4;
        numbers[18] = 9;
        numbers[19] = 9;
        //93

        //When
      ArrayOperations.getAverage(numbers);

int[] result= new int[0];
result[0]= 4;

        //Then
       // Assert.assertArrayEquals(4.65,numbers,0.65);
        Assert.assertArrayEquals(result,numbers);

    }
}

