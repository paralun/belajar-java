package com.paralun.basic;

public class TypeDataArray {
    public static void main(String[] args) {
        String[] names = new String[2];
        names[0] = "James";
        names[1] = "Kusmambang";

        System.out.println(names[0]);
        System.out.println(names[1]);

        //Array Initializer
        Integer[] arrayInt = new Integer[]{
                30, 20, 70, 10
        };

        Long[] arrayLong = {
                20L, 90L, 90L
        };

        // Array multi dimensi
        Integer[][] matrix = {
                {38, 90, 88},
                {65, 34, 55},
                {15, 65}
        };

        System.out.println(matrix[0][0]);
        System.out.println(matrix[0][1]);
        System.out.println(matrix[0][2]);

        System.out.println(matrix[1][0]);
        System.out.println(matrix[1][1]);
        System.out.println(matrix[1][2]);

        System.out.println(matrix[2][0]);
        System.out.println(matrix[2][1]);
    }
}
