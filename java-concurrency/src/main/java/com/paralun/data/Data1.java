package com.paralun.data;

public class Data1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Hallo: " + Thread.currentThread().getName());
    }
}
