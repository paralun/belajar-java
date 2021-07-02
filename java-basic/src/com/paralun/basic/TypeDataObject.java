package com.paralun.basic;

public class TypeDataObject {
    public static void main(String[] args) {
        Byte byteVal = 127;
        Short shortVal = 32767;
        Integer integerVal = 2147483647;
        Long longVal = 9223372036854775807L;
        Float floatVal = 77.99f;
        Double doubleVal = 99.665d;
        Character characterVal = 'G';
        Boolean booleanVal = false;

        //Konversi dari type data primitive
        Integer age = 20;
        int ageInt = age;

        short ageShort = age.shortValue();
        byte ageByte = age.byteValue();
    }
}
