package com.paralun.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(1,2,3,4,5,6));

        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer value) {
                return value > 4;
            }
        });

        // Lambda
        list.removeIf(value -> value > 4);
    }
}
