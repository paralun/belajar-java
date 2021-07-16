package com.paralun.highlevel;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTest {

    @Test
    void testExecutorService_single() throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 5; i++) {
            executor.execute(() -> {
                try {
                    Thread.sleep(1000L);
                    System.out.println("Thread: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void testExecutorService_fix() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 20; i++) {
            executor.execute(() -> {
                try {
                    Thread.sleep(1000L);
                    System.out.println("Thread: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void testExecutorService_cached() throws InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 20; i++) {
            executor.execute(() -> {
                try {
                    Thread.sleep(1000L);
                    System.out.println("Thread: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
