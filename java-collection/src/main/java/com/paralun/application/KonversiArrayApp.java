package com.paralun.application;

import java.util.Arrays;
import java.util.List;

public class KonversiArrayApp {
    public static void main(String[] args) {
        List<String> names = List.of("James", "Kusmambang");

        Object[] objects = names.toArray();
        String[] strings = names.toArray(new String[]{});

        System.out.println(Arrays.toString(strings));
    }
}
