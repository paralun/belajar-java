package com.paralun.application;

import java.util.Iterator;
import java.util.List;

public class IteratorApp {
    public static void main(String[] args) {
        Iterable<Integer> iterable = List.of(2, 4, 6, 80, 32);
        Iterator<Integer> iterator = iterable.iterator();

        while (iterator.hasNext()) {
            Integer data = iterator.next();
            System.out.println(data);
        }
    }
}
