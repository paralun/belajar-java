package com.paralun.application;

import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<Integer> data = List.of(2, 4, 6, 80, 32);

        for (var result : data) {
            System.out.println(result);
        }
    }
}
