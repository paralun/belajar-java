package com.paralun.constructors;

public class ClassD extends ClassC {

    public ClassD() {
        super("SUPER");
    }

    public void myMethodChild() {
        super.myMethod();
    }

    public static void main(String[] args) {
        ClassD child = new ClassD();
        child.myMethodChild();
    }
}
