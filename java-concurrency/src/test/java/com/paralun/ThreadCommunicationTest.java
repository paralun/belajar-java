package com.paralun;

import org.junit.jupiter.api.Test;

public class ThreadCommunicationTest {

    private String value = null;

    @Test
    void manual() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (value == null) {
                // Wait
            }
            System.out.println(value);
        });

        Thread thread2 = new Thread(() -> {
            value = "Thread Communication";
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

    @Test
    void waitAndNotify() throws InterruptedException {
        Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                    System.out.println(value);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                lock.notify();
                value = "Thread Communication";
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

    @Test
    void waitAndNotifyAll() throws InterruptedException {
        Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                    System.out.println(value);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                    System.out.println(value);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread3 = new Thread(() -> {
            synchronized (lock) {
                lock.notifyAll();
                value = "Thread Communication";
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
    }
}
