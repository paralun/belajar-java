package com.paralun;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {

    @Test
    void testToList() {
        List<Integer> list = List.of(1,2,3,4,5,6,7).stream()
                .map(value -> value * 2)
                .collect(Collectors.toList());

        list.forEach(System.out::println);
    }

    @Test
    void testToSet() {
        List<Integer> list = List.of(1,2,3,3,4,5,6,7);
        Set<Integer> set = list.stream()
                .map(value -> value * 2)
                .collect(Collectors.toSet());

        set.forEach(System.out::println);
    }

    @Test
    void testToMap() {
        List<String> list = List.of("James", "Kusmambang");
        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length()
                ));
        System.out.println(map);
    }
}
