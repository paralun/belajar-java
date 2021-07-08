package com.paralun.interfaces;

public interface FirstInterface {
    public void myMethod();

    // Java >= 8
    default boolean isMethod() {
        return false;
    }
}
