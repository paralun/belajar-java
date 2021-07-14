package com.paralun.application;

import java.util.Optional;

public class App {
    public static void main(String[] args) {

        Optional<String> optional1 = Optional.empty();

        Optional<String> optional2= Optional.of("Hallo");

        Optional<String> optional3 = Optional.ofNullable("Hallo");

        System.out.println(optional1.isEmpty());
        System.out.println(optional1.isPresent());
        System.out.println(optional2.isPresent());
        System.out.println(optional3.isPresent());

    }
}
