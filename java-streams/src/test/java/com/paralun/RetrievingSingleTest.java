package com.paralun;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class RetrievingSingleTest {

    @Test
    void testFindAny() {
        List<String> names = List.of("James", "Kusmambang");
        Optional<String> optional = names.stream().findAny();
        optional.ifPresent(value -> System.out.println(value));
    }

    @Test
    void testFindFirst() {
        List<String> names = List.of("James", "Kusmambang");
        Optional<String> optional = names.stream().findFirst();
        optional.ifPresent(value -> System.out.println(value));
    }
}
