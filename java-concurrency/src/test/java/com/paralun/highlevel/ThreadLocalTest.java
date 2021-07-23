package com.paralun.highlevel;

import com.paralun.data.SampleThreadLocal;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadLocalTest {

    @Test
    void testThreadLocal() throws InterruptedException {
        Random random = new Random();
        SampleThreadLocal local = new SampleThreadLocal();
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            final int index = i;
            executor.execute(() -> {
                try {
                    local.setUser("User-" + index);
                    Thread.sleep(1000 + random.nextInt(3000));
                    local.doAction();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
