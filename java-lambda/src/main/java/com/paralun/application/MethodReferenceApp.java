package com.paralun.application;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
        Function<String, String> function = String::toUpperCase;
        System.out.println(function.apply("qwerty"));

        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicate = app::isLowerCase;
        System.out.println(predicate.test("qwerty"));
        System.out.println(predicate.test("Qwerty"));
    }

    public boolean isLowerCase(String value) {
        for (char c : value.toCharArray()) {
            if(!Character.isLowerCase(c)) {
                return false;
            }
        }

        return true;
    }
}
