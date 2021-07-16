package com.paralun;

import org.junit.jupiter.api.Test;

public class ThreadTest {

    @Test
    void testGetNameThread() {
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }

    @Test
    void testThreadSleep() {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000L);
                System.out.println("Hallo: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();

        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Selesai");
    }

    @Test
    void testThreadJoin() throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000L);
                System.out.println("Hallo: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.setName("Custom");
        thread.start();
        thread.join();
        System.out.println("Selesai");
    }

    @Test
    void testThreadInterrupted() throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hallo: " + i + " " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    return;
                }
            }
        });

        thread.start();
        Thread.sleep(5000L);
        thread.interrupt();
        System.out.println("Selesai");
    }

    @Test
    void testThreadInterrupted2() throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hallo: " + i + " " + Thread.currentThread().getName());
                if (Thread.interrupted()) {
                    return;
                }
            }
        });

        thread.start();
        Thread.sleep(2000L);
        thread.interrupt();
        System.out.println("Selesai");
    }

    @Test
    void testThreadState() throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getState());
            System.out.println("Hallo: " + Thread.currentThread().getName());
        });

        thread.setName("Custom");
        System.out.println(thread.getState());
        thread.start();
        thread.join();
        System.out.println(thread.getState());
        System.out.println("Selesai");
    }
}
