package com.paralun.exercise;

public class Diamond5 {
    public static void main(String[] args) {
        var num = 5;

        for (var i = 1; i <= num; i++) {

            for (var j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (var i = (num - 1); i >= 1; i--) {

            for (var j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
