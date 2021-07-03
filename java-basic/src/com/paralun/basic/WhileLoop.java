package com.paralun.basic;

public class WhileLoop {
    public static void main(String[] args) {

        var counter = 1;
        while (counter <= 5) {
            System.out.println("Perulangan Ke " + counter);
            counter++;
        }

        //Do/While
        var i = 1;
        do {
            System.out.println("Perulangan ke " + i);
            i++;
        }while (i <= 5);
    }
}
