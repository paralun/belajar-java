package com.paralun.application;

import java.util.LinkedList;
import java.util.List;

public class LinkedListApp {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(8);
        list.addAll(List.of(7,9,10));

        Integer getValue = list.get(3);
        System.out.println(getValue);

        for (var value : list) {
            System.out.println(value);
        }
    }
}
