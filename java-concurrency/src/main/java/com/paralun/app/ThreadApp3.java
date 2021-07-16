package com.paralun.app;

import com.paralun.data.Data2;

public class ThreadApp3 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Data2());
        Thread thread2 = new Thread(new Data2());

        thread1.start();
        thread2.start();

        // thread di main method, threadnya akan di tungguin sampai selesai, berbeda dengan junit
        //thread1.join();
        //thread2.join();

        System.out.println("Selesai");
    }
}
