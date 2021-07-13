package com.paralun;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingTest {

    @Test
    void testGrouping() {
        Map<String, List<Integer>> group = Stream.of(1,2,3,4,5,6,7,8,9,10)
                .collect(Collectors.groupingBy(number -> number > 5 ? "Besar" : "Kecil"));
        System.out.println(group);
    }
}
