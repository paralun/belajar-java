package com.paralun.application;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentifyHashMapApp {
    public static void main(String[] args) {
        String key1 = "name.first";

        String name = "name";

        String key2 = name + "." + "first";

        Map<String, String> map = new IdentityHashMap<>();
        map.put(key1, "James");
        map.put(key2, "James");

        System.out.println(map.size());
    }
}
