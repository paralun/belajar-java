package com.paralun.application;

import com.paralun.data.SimpleAction2;

public class SimpleAction2App {
    public static void main(String[] args) {

        SimpleAction2 simple1 = (String value) -> {
            return "Hallo" + value;
        };

        SimpleAction2 simple2 = (value) -> {
            return "Hallo" + value;
        };

        SimpleAction2 simple3 = (String value) -> "Hallo" + value;

        SimpleAction2 simple4 = (value) -> "Hallo" + value;

        SimpleAction2 simple5 = value -> "Hallo" + value;

        System.out.println(simple1.action("James"));
        System.out.println(simple2.action("Nia"));
        System.out.println(simple3.action("Shania"));
        System.out.println(simple4.action("Bambang"));
        System.out.println(simple5.action("Juwita"));
    }
}
