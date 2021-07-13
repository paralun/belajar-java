package com.paralun;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateStreamFromArray() {
        Stream<String> stringStream = Stream.of("a","b","c");
        stringStream.forEach(value -> System.out.println(value));
    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<Integer> collection = List.of(1,2,3,4,5,6,7,8);
        Stream<Integer> stream = collection.stream();
        stream.forEach(System.out::println);
    }

    @Test @Disabled
    void testCreateInfiniteStream() {
        Stream<String> generate = Stream.generate(() -> "Tidak akan berhenti");

        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
    }
}
