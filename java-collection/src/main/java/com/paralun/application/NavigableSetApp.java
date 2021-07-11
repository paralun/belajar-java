package com.paralun.application;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("James", "Kusmambang", "Ganteng", "Ramah", "Baik"));

        NavigableSet<String> namesDesc = names.descendingSet();

        for (var name : namesDesc) {
            System.out.println(name);
        }
    }
}
