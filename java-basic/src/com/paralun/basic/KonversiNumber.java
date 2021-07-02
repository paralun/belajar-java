package com.paralun.basic;

public class KonversiNumber {
    public static void main(String[] args) {
        // Widening Casting (Otomatis): byte -> short -> int -> long -> float -> double
        byte byteVal = 10;
        short shortVal = byteVal;
        int intVal = shortVal;
        long longVal = intVal;
        float floatVal = longVal;
        double doubleVal = floatVal;

        // Narrowing Casting (Manual): double -> float -> long -> int -> char -> short -> byte
        double doubleVal2 = 10d;
        float floatVal2 = (float) doubleVal2;
        long longVal2 = (long) floatVal2;
        int intVal2 = (int) longVal2;
        short shortVal2 = (short) intVal2;
        byte byteVal2 = (byte) shortVal2;
    }
}
