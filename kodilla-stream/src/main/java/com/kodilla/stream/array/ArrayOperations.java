package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, 20)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        IntStream.range(0, 20)
                .map(n -> numbers[n])
                .average();

    }
}
