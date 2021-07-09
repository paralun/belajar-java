package com.paralun.statickeyword;

public class StaticBlock {

    public static final String APPLICATION;

    static {
        System.out.println("Di Panggil");
        APPLICATION = "Belajar Java";
    }
}
