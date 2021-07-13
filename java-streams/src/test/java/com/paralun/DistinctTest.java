package com.paralun;

import org.junit.jupiter.api.Test;

import java.util.List;

public class DistinctTest {

    @Test
    void testDistinct() {
        List.of("James", "Kusmambang", "James", "Kusmambang").stream()
                .distinct()
                .forEach(System.out::println);
    }
}
