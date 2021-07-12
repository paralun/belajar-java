package com.paralun.foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Data1");
        map.put(2, "Data2");
        map.put(3, "Data3");
        map.put(4, "Data4");

        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer key, String value) {
                System.out.println(key + ":" + value);
            }
        });

        // Lambda
        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
