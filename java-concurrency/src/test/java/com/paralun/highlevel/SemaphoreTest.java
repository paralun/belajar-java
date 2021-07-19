package com.paralun.highlevel;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreTest {

    @Test
    void testSemaphore() throws InterruptedException {
        Semaphore semaphore = new Semaphore(10);
        ExecutorService executor = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 1000 ; i++) {
            executor.execute(() -> {
                try {
                    semaphore.acquire();
                    Thread.sleep(1000L);
                    System.out.println("Finish");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }
            });
        }

        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
