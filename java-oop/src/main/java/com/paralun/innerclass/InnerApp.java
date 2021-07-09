package com.paralun.innerclass;

public class InnerApp {
    public static void main(String[] args) {

        OuterClass outer = new OuterClass();
        outer.setName("Nama Outer");
        System.out.println(outer.getName());

        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.setName("Nama Inner");
        System.out.println(inner.getName());
        System.out.println(inner.getOtherName());

    }
}
