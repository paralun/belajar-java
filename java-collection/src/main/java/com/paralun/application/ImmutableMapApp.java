package com.paralun.application;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> one = Collections.singletonMap("Key1", "Data1");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("key1", "Data1");
        mutable.put("key2", "Data2");

        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "key1", "Data1",
                "key2", "Data2"
        );
    }
}
