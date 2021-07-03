package com.paralun.basic;

public class Method {
    public static void main(String[] args) {
        myMethod();
        myMethodParam("Paralun");

        var result = myMethodReturn();
        System.out.println(result);

        myMethodArgs(1, 2, 3, 4, 5);
    }

    static void myMethod() {
        System.out.println("Simpel Method");
    }

    // Method Parameter
    static void myMethodParam(String name) {
        System.out.println("Hallo " + name);
    }

    //Method Return Value
    static String myMethodReturn() {
        return "Method Return Value";
    }

    // Method Variable Argument
    static void myMethodArgs(int... values) {
        for (int val : values) {
            System.out.println(val);
        }
    }

    // Method Overloading (membuat method dengan nama yg sama, dengan syarat parameter yg berbeda)
    static void myMethodOverloading() {
        System.out.println("Method Overloading tanpa parameter");
    }

    static void myMethodOverloading(String param) {
        System.out.println("Method Overloading dengan parameter " + param);
    }

    // Recrusive Method (memanggil method sendiri)
    static int factorial(int value) {
        if (value == 1) {
            return 1;
        }else {
            return value * factorial(value -1);
        }
    }
}
