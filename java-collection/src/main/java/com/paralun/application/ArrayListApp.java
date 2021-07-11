package com.paralun.application;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer getVal = list.get(1);
        Integer size = list.size();

        System.out.println(getVal);
        System.out.println(size);

        for (var value : list) {
            System.out.println(value);
        }
    }
}
