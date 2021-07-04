package com.paralun.exercise;

public class Diamond3 {
    public static void main(String[] args) {
        var num = 5;

        for (var i = 1; i <= num; i++) {

            for (var j = 1; j <= (num + 1 - i); j++) {
                System.out.print("*");
            }

            for (var k = 1; k < (2 * i -1); k++) {
                System.out.print(" ");
            }

            for (var l = 1; l <= (num + 1 - i); l++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (var i = (num -1); i >= 1; i--) {

            for (var j = num; j >= i; j--) {
                System.out.print("*");
            }

            for (int k = 1; k < (2 * i - 1); k++) {
                System.out.print(" ");
            }

            for (var l = num; l >= i; l--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
