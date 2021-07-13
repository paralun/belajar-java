package com.paralun.application;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        // Empty Stream
        Stream<String> empty = Stream.empty();

        // Null Stream
        Stream<String> nullStream = Stream.ofNullable(null);

        // Stream one
        Stream<String> one = Stream.of("a");

        // Stream of Array
        Stream<String> streamOfArray = Stream.of("a", "b", "c");
        Stream<Integer> streamOfArray2 = Arrays.stream(new Integer[]{1,2,3,4,5});

        // Stream of Collection
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();
    }
}
