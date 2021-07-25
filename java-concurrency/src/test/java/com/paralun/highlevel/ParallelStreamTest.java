package com.paralun.highlevel;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamTest {

    @Test
    void parallel() {
        IntStream.range(0, 1000).boxed().parallel().forEach(value -> {
            System.out.println(Thread.currentThread().getName() + " : " + value);
        });
    }

    @Test
    void customPool() {
        ForkJoinPool pool = new ForkJoinPool(4);
        ForkJoinTask<?> task = pool.submit(() -> {
            IntStream.range(0, 1000).boxed().parallel().forEach(value -> {
                System.out.println(Thread.currentThread().getName() + " : " + value);
            });
        });

        task.join();
    }
}
