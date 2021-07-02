package com.paralun.basic;

public class IFStatement {
    public static void main(String[] args) {
        var nilai = 90;

        if (nilai >= 90) {
            System.out.println("A");
        }else if (nilai >= 75) {
            System.out.println("B");
        }else if (nilai > 60) {
            System.out.println("C");
        }else if (nilai > 45) {
            System.out.println("D");
        }else {
            System.out.println("E");
        }


        // Ternary Operator
        String text = nilai > 75 ? "Lulus" : "Tidak Lulus";
        System.out.println(text);
    }
}
