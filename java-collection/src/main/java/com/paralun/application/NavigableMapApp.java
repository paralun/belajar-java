package com.paralun.application;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(2, "James");
        map.put(3, "Kusmambang");
        map.put(1, "Ginting");

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.lowerKey(2));
        System.out.println(map.higherKey(2));
        System.out.println(map.floorKey(2));
        System.out.println(map.ceilingKey(2));
    }
}
