package com.paralun.highlevel;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTest {

    @Test
    void testCondition() throws InterruptedException {
        AtomicReference<String> message = new AtomicReference<>();
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        ExecutorService executor1 = Executors.newFixedThreadPool(2);
        executor1.execute(() -> {
            try {
                lock.lock();
                condition.await();
                System.out.println(message.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        });

        executor1.execute(() -> {
            try {
                lock.lock();
                message.set("Condiditon");
                condition.signal();
            }finally {
                lock.unlock();
            }
        });

        executor1.shutdown();
        executor1.awaitTermination(1, TimeUnit.DAYS);
    }
}
