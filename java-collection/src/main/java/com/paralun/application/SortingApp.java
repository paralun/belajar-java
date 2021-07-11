package com.paralun.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(7);
        list.add(3);
        list.add(5);

        Collections.sort(list);

        for (var value : list) {
            System.out.println(value);
        }

        List<String> list2 = new ArrayList<>();
        list2.add("D");
        list2.add("A");
        list2.add("C");
        list2.add("F");
        list2.add("E");
        list2.add("B");

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(list2, comparator);

        for (var value : list2) {
            System.out.println(value);
        }
    }
}
