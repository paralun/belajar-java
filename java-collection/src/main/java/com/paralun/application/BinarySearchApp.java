package com.paralun.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add("Data" + i);
        }

        int index = Collections.binarySearch(list, "Data39");

        System.out.println(index);
        System.out.println(list.get(index));
    }
}
