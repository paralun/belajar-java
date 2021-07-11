package com.paralun.application;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("first", "James");
        map.put("last", "Kusmambang");
        map.put("nick", "Paralun");

        System.out.println(map.get("last"));

        System.out.println("==========");

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("==========");

        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
