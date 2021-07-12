package com.paralun.application;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> predicate = value -> value.isEmpty();
        System.out.println(predicate.test(""));
    }
}
