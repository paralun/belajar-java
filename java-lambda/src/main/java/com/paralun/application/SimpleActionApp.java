package com.paralun.application;

import com.paralun.data.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        //anonymous class
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action() {
                return "anonymous class";
            }
        };

        System.out.println(simpleAction1.action());

        // Lambda 1
        SimpleAction simpleAction2 = () -> {
            return "Lambda1";
        };
        System.out.println(simpleAction2.action());

        // Lambda 2
        SimpleAction simpleAction3 = () -> "lambda2";
        System.out.println(simpleAction3.action());
    }
}
