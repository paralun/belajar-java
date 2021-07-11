package com.paralun.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetApp {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
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
