package com.paralun.app;

public class ThreadApp1 {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);

        Thread thread = new Thread(() -> System.out.println("Hallo: " + Thread.currentThread().getName()));
        thread.start();

        System.out.println("Selesai");
    }
}
