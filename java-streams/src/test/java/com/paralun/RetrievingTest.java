package com.paralun;

import org.junit.jupiter.api.Test;

import java.util.List;

public class RetrievingTest {

    @Test
    void testLimit() {
        List.of(1,2,3,4,5,6,7,8,9).stream()
                .limit(4)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of(1,2,3,4,5,6,7,8,9).stream()
                .skip(4)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("James", "Kusmambang", "Dinda").stream()
                .takeWhile(value -> value.length() <= 5)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("James", "Kusmambang", "Dinda").stream()
                .dropWhile(value -> value.length() <= 5)
                .forEach(System.out::println);
    }
}
