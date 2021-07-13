package com.paralun;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class StreamBuilderTest {

    @Test
    void testCreateStreamBuilder() {
        Stream.Builder<Integer> builder = Stream.builder();
        builder.accept(1);
        builder.add(2).add(3);

        Stream<Integer> stream = builder.build();
        stream.forEach(System.out::println);
    }
}
