package com.paralun;

import com.paralun.data.Counter;
import org.junit.jupiter.api.Test;

public class SynchronizationTest {

    @Test
    void testCounterSynchronization_method() throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = () -> {
            for (int i = 1; i <= 100_000; i++) {
                counter.increment2();
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.getValue());
    }

    @Test
    void testCounterSynchronization_statement() throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = () -> {
            for (int i = 1; i <= 100_000; i++) {
                counter.increment3();
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.getValue());
    }
}
