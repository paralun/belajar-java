package com.paralun.app;

import com.paralun.data.Data1;

public class ThreadApp2 {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);

        Thread thread = new Thread(new Data1());
        thread.start();

        System.out.println("Selesai");
    }
}
