package com.paralun.basic;

public class OperasiMatematika {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assignments
        Integer c = 10;
        //c = c + 40;
        c += 40;
        System.out.println(c);

        // Unary Operator
        Integer d = 1;
        //d = d + 1;
        d++;
        System.out.println(d);
    }
}
