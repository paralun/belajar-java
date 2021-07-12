package com.paralun.application;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        String name = "James";

        //Optional<String> optional = Optional.ofNullable(name).map(s -> s.toUpperCase());
        //optional.ifPresent(System.out::println);

        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresent(System.out::println);
    }
}
