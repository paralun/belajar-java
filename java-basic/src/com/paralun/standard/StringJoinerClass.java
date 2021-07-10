package com.paralun.standard;

import java.util.StringJoiner;

public class StringJoinerClass {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner("|", "[", "]");
        joiner.add("James");
        joiner.add("Kusmambang");

        String text = joiner.toString();

        System.out.println(text);
    }
}
