package com.paralun.statickeyword;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.URL);
        System.out.println(Constant.PORT);
        System.out.println(Constant.add(5, 5));

        System.out.println(StaticBlock.APPLICATION);
    }
}
