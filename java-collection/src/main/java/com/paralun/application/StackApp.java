package com.paralun.application;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("James");
        stack.push("Kusmambang");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
