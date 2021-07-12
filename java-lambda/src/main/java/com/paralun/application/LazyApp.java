package com.paralun.application;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        testScore(60, () -> getName());
    }

    static void testScore(int score, Supplier<String> name) {
        if (score >= 80) {
            System.out.println("Selamat " + name.get() + " anda lulus");
        }else {
            System.out.println("Coba lagi ya...");
        }
    }

    static String getName() {
        System.out.println("Method getName() dipanggil");
        return "James";
    }
}
