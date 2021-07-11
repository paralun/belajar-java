package com.paralun.application;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        // LIFO
        Deque<Integer> stack = new LinkedList<>();
        stack.offerFirst(2);
        stack.offerFirst(1);
        stack.offerFirst(5);
        stack.offerFirst(7);

        for (var value : stack) {
            System.out.println(value);
        }

        System.out.println("=============");

        // FIFO
        Deque<Integer> queue = new LinkedList<>();
        queue.offerLast(2);
        queue.offerLast(1);
        queue.offerLast(5);
        queue.offerLast(7);

        for (var value : queue) {
            System.out.println(value);
        }
    }
}
