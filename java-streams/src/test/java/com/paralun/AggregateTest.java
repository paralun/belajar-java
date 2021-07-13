package com.paralun;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateTest {

    @Test
    void testMax() {
        List.of(2,3,9,1,5).stream()
                .max(Comparator.naturalOrder())
                .ifPresent(value -> System.out.println(value));
    }

    @Test
    void testMin() {
        List.of(2,3,9,1,5).stream()
                .min(Comparator.naturalOrder())
                .ifPresent(value -> System.out.println(value));
    }

    @Test
    void testCount() {
        long count = List.of(2,3,9,1,5).stream()
                .count();
        System.out.println(count);
    }

    @Test
    void testReduce() {
        Integer sum = List.of(2,3,9,1,5).stream()
                .reduce(0, (value, item) -> value + item);
        System.out.println(sum);
    }
}
