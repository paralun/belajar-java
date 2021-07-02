package com.paralun.basic;

public class TypePrimitive {
    public static void main(String[] args) {
        //byte: Min: -128 - Max: 127 - 8 bit
        byte byteVal = 127;

        //short: Min: -32,768 - Max: 32,767 - 16 bit
        short shortVal = 32767;

        //int: Min: -2,147,483,648 - Max: 2,147,483,647 - 32 bit
        int intVal = 2147483647;

        //long: Min: -9,223,372,036,854,775,808 - Max: 9,223,372,036,854,775,807 - 64 bit
        long longVal = 9223372036854775807L;
        long longVal2 = 9_223_372_036_854_775_807L;

        //float
        float floatVal = 123.4f;

        //double
        double doubleVal = 555.678d;

        //boolean
        boolean booleanVal = true;

        //char
        char charVal = 'A';

        //Integer Literals
        int decVal = 26;
        int hexVal = 0x1a;
        int binVal = 0b11010;
    }
}
