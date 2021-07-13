package com.paralun;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingTest {

    @Test
    void testSorted() {
        List.of(3,7,1,2,8,9,5,4).stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<Integer> comparator = Comparator.reverseOrder();

        List.of(3,7,1,2,8,9,5,4).stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }
}
