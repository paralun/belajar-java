package com.paralun.application;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "James");
        map.put(2, "Kusmambang");
        map.put(3, "Ginting");

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }
    }
}
