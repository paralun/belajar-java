package com.paralun.application;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("James");
        set.add("Kusmambang");
        set.add("James");
        set.add("Kusmambang");
        set.add("Ganteng");

        for (var value : set) {
            System.out.println(value);
        }
    }
}
