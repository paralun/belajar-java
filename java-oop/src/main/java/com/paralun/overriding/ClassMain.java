package com.paralun.overriding;

public class ClassMain {
    public static void main(String[] args) {
        ClassA parent = new ClassA();
        parent.myMethod();

        ClassB child = new ClassB();
        child.myMethod();
        child.myMethodParent();
    }
}
