package com.paralun;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class PrimitiveTest {

    @Test
    void testIntStream() {
        IntStream intStream1 = IntStream.of(1,2,3,4,5);
        intStream1.forEach(System.out::println);

        IntStream intStream2 = IntStream.range(1, 5);
        intStream2.forEach(System.out::println);

        IntStream intStream3 = IntStream.builder().add(1).add(2).build();
        intStream3.forEach(System.out::println);
    }

    @Test
    void testOperations() {
        OptionalDouble avg = IntStream.range(1, 100).average();
        avg.ifPresent(System.out::println);
    }
}
