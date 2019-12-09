package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static void getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .ifPresent(System.out::println);
    }
}


