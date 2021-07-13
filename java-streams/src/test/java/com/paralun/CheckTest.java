package com.paralun;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckTest {

    @Test
    void testAnyMatch() {
        boolean any = List.of(1,2,3,4,5,6,7,8,9).stream()
                .anyMatch(value -> value >= 7);
        System.out.println(any);
    }

    @Test
    void testAllMatch() {
        boolean all = List.of(1,2,3,4,5,6,7,8,9).stream()
                .allMatch(value -> value >= 0);
        System.out.println(all);
    }

    @Test
    void testNoneMatch() {
        boolean none = List.of(1,2,3,4,5,6,7,8,9).stream()
                .noneMatch(value -> value <= 0);
        System.out.println(none);
    }
}
