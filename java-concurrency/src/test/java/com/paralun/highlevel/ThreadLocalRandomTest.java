package com.paralun.highlevel;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ThreadLocalRandomTest {

    @Test
    void testLocalRandom() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(50);

        for (int i = 0; i < 50; i++) {
            executor.execute(() -> {
                try {
                    Thread.sleep(1000L);
                    int number = ThreadLocalRandom.current().nextInt(200);
                    System.out.println(number);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void stream() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(50);
        executor.execute(() -> {
            ThreadLocalRandom.current().ints(50, 0, 200).forEach(System.out::println);
        });

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
