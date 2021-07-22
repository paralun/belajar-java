package com.paralun.highlevel;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

public class ConcurrentMapTest {

    @Test
    void testConcurrentMap() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(10);
        ConcurrentMap<Integer, String> map = new ConcurrentHashMap<>();
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10 ; i++) {
            final int index = i;
            executor.execute(() -> {
                try {
                    Thread.sleep(1000L);
                    map.putIfAbsent(index, "Data-" + index);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    latch.countDown();
                }
            });
        }

        executor.execute(() -> {
            try {
                latch.await();
                map.forEach((index, value) -> System.out.println(index + ":" + value));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
