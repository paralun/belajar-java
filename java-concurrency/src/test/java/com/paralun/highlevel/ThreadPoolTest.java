package com.paralun.highlevel;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {

    @Test
    void executeRunnable() throws InterruptedException {
        int corePoolSize= 10;
        int maximumPoolSize = 100;
        long keepAliveTime = 1;
        TimeUnit unit = TimeUnit.MINUTES;
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(100);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, queue);
        Runnable runnable = () -> {
            System.out.println("Thread name: " + Thread.currentThread().getName());
        };

        executor.execute(runnable);
        Thread.sleep(1000L);
    }
}
