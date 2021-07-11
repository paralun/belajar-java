package com.paralun.application;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeApp {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(10);
        queue.offer(5);
        queue.offer(4);
        queue.offer(9);
        queue.offer(1);
        queue.offer(2);

        for (Integer value = queue.poll(); value != null; value = queue.poll()) {
            System.out.println(value);
        }

        System.out.println("Size: " + queue.size());
    }
}
