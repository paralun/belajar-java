package com.paralun;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class MapTest {

    @Test
    void testMapStream() {
        List<String> list = List.of("james", "kusmambang");
        Stream<String> names = list.stream();
        Stream<String> namesUpper = names.map(name -> name.toUpperCase());
        namesUpper.forEach(upper -> System.out.println(upper));
    }

    @Test
    void testMapStreamSimple() {
        List.of("james", "kusmambang").stream()
                .map(names -> names.toUpperCase())
                .forEach(upper -> System.out.println(upper));
    }

    @Test
    void testMultipleMapStream() {
        List.of("james", "kusmambang").stream()
                .map(names -> names.toUpperCase())
                .map(upper -> "Mr. " + upper)
                .forEach(mr -> System.out.println(mr));
    }

    @Test
    void testMapStream2() {
        List.of("james", "kusmambang").stream()
                .map(names -> names.toUpperCase())
                .map(upper -> upper.length())
                .forEach(length -> System.out.println(length));
    }
}
