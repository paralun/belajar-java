package com.paralun.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(3);
        collection.add(7);
        collection.addAll(Arrays.asList(2, 4, 9));

        collection.remove(2);

        for (var value : collection) {
            System.out.println(value);
        }

        // Mengecek data di collection
        System.out.println(collection.contains(3));
    }
}
