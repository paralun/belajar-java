package com.paralun.standard;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("James");
        builder.append(" ");
        builder.append("Kusmambang");

        String text = builder.toString();

        System.out.println(text);

    }
}
