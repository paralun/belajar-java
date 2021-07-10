package com.paralun.standard;

public class StringClass {
    public static void main(String[] args) {
        String text = "James Kusmambang";

        String upper = text.toUpperCase();
        String lower = text.toLowerCase();
        int length = text.length();
        char ch = text.charAt(3);
        String replace = text.replace("Kusmambang", "Ganteng");
        int idx = text.lastIndexOf("a");
        boolean start = text.startsWith("James");
        boolean end = text.endsWith("Kusmambang");
        String concat = text.concat(" Ginting");
        String[] values = text.split(" ");

        System.out.println(upper);
        System.out.println(lower);
        System.out.println(length);
        System.out.println(ch);
        System.out.println(replace);
        System.out.println(idx);
        System.out.println(start);
        System.out.println(end);
        System.out.println(concat);

        for (String value : values) {
            System.out.println(value);
        }
    }
}
