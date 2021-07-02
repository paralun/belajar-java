package com.paralun.basic;

public class OperasiBoolean {
    public static void main(String[] args) {
        // Operasi && (and)
        System.out.println("== Operasi && ==");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // Operasi || (or)
        System.out.println("== Operasi || ==");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // Operasi ! (kebalikan)
        System.out.println("== Operasi ! ==");
        System.out.println(!true);
        System.out.println(!false);
    }
}
