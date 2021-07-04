package com.paralun.exercise;

public class Diamond4 {
    public static void main(String[] args) {
        var num = 5;

        for (var i = 1; i <= num; i++) {

            for (var j = 1; j <= (num - i); j++) {
                System.out.print(" ");
            }

            for (var k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (var i = 2; i <= num; i++) {

            for (var j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (var k = i; k <= num; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
