package com.paralun.exercise;

public class Diamond1 {
    public static void main(String[] args) {
        var value = 5;
        for (var i = 1; i <= value; i++) {

            for (var j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
