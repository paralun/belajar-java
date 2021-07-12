package com.paralun.application;

import java.util.function.BiConsumer;

public class BiConsumerApp {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (s, s2) -> System.out.println(s + " " + s2);

        biConsumer.accept("James", "Kusmambang");
    }
}
