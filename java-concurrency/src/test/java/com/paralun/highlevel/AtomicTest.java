package com.paralun.highlevel;

import com.paralun.data.CounterAtomic;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AtomicTest {

    @Test
    void testRaceCondition_correct() throws InterruptedException {
        CounterAtomic counter = new CounterAtomic();
        Runnable runnable = () -> {
            for (int i = 1; i <= 100_000; i++) {
                counter.increment();
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
        System.out.println(counter.getValue());
    }
}
