package com.paralun.exercise;

public class Diamond2 {
    public static void main(String[] args) {
        var num = 5;

        for (var i = 1; i <= num; i++) {

            for (var j = i; j < num; j++) {
                System.out.print(" ");
            }

            for (var k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (var x = num - 1; x >= 1; x--) {

            for (var y = num; y > x; y--) {
                System.out.print(" ");
            }

            for (var z = 1; z < (x * 2); z++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
