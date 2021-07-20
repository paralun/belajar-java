package com.paralun.highlevel;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

public class BlockingQueueTest {

    @Test
    void testArrayBlockingQueue() throws InterruptedException {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
        ExecutorService executor = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 10; i++) {
            executor.execute(() -> {
                try {
                    queue.put("Data");
                    System.out.println("Success Put Data");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.execute(() -> {
            while (true) {
                try {
                    Thread.sleep(2000L);
                    String data = queue.take();
                    System.out.println("Receive: " + data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executor.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void testLinkedBlockingQueue() throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingDeque<>();
        ExecutorService executor = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 10; i++) {
            executor.execute(() -> {
                try {
                    queue.put("Data");
                    System.out.println("Success Put Data");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.execute(() -> {
            while (true) {
                try {
                    Thread.sleep(2000L);
                    String data = queue.take();
                    System.out.println("Receive: " + data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
