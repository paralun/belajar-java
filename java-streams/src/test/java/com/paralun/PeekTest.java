package com.paralun;

import org.junit.jupiter.api.Test;

import java.util.List;

public class PeekTest {

    @Test
    void testPeek() {
        List.of("James", "Kusmambang").stream()
                .peek(name -> System.out.println("Before: " + name))
                .map(name -> name.toUpperCase())
                .peek(name -> System.out.println("After: " + name))
                .forEach(name -> System.out.println("Final: " + name));
    }
}
