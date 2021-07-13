package com.paralun;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class FlatMapTest {

    @Test
    void testFlatMap() {
        List.of("james", "kusmambang").stream()
                .map(names -> names.toUpperCase())
                .flatMap(upper -> Stream.of(upper, upper.length()))
                .forEach(value -> System.out.println(value));
    }

    @Test
    void testFlatMap2() {
        List.of(1, 2, 3, 4, 5).stream()
                .flatMap(upper -> Stream.of(upper, upper * 2))
                .forEach(value -> System.out.println(value));
    }
}
