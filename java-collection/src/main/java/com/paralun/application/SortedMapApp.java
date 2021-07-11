package com.paralun.application;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {
        SortedMap<Integer, String> sort = new TreeMap<>();
        sort.put(2, "James");
        sort.put(3, "Kusmambang");
        sort.put(1, "Ginting");

        for (Integer key : sort.keySet()) {
            System.out.println(key);
        }
    }
}
