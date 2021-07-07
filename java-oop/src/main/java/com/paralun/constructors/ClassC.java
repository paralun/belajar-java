package com.paralun.constructors;

public class ClassC {

    public ClassC() {
        System.out.println("Constructor Parent");
    }

    public ClassC(String param) {
        System.out.println("Constructor Parent with Param: " + param);
    }

    public void myMethod() {
        System.out.println("Method Class C");
    }
}
