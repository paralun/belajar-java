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

        // Switch Lambda (Java 14)
       /* var day = 4;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> {
                System.out.println("Invalid");
            }
        }*/
    }
}
