package com.paralun.standard;

import java.util.StringTokenizer;

public class StringTokenizerClass {
    public static void main(String[] args) {
        String text = "James Kusmambang";
        StringTokenizer tokenizer = new StringTokenizer(text, " ");
        int count = tokenizer.countTokens();

        System.out.println(count);

        while (tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
}
