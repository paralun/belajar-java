package com.paralun;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilterTest {

    @Test
    void testFilter() {
        List.of(1,2,3,4,5,6,7,8,9,10).stream()
                .filter(value -> value % 2 == 0)
                .forEach(System.out::println);
    }
}
