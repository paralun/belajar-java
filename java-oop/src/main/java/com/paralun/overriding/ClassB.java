package com.paralun.overriding;

public class ClassB extends ClassA {

    @Override
    public void myMethod() {
        System.out.println("Method Class B");
    }

    public void myMethodParent() {
        super.myMethod();
    }
}
