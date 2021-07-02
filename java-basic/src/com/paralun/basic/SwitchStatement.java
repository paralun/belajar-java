package com.paralun.basic;

public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = 'B';

        switch (nilai) {
            case 'A':
                System.out.println("Sangat Baik");
                break;
            case 'B':
                System.out.println("Baik");
                break;
            case 'C':
                System.out.println("Cukup");
                break;
            case 'D':
                System.out.println("Kurang");
                break;
            default:
                System.out.println("Sangat Kurang");
        }

    }
}
