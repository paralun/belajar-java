package com.paralun.highlevel;

import com.paralun.data.SampleForkJoinTask;
import com.paralun.data.SampleRecursiveTask;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ForkJoinTest {

    @Test
    void create() {
        // total cpu core
        ForkJoinPool forkJoinPool1 = ForkJoinPool.commonPool();
        // 5 cpu core
        ForkJoinPool forkJoinPool2 = new ForkJoinPool(5);

        ExecutorService executor1 = Executors.newWorkStealingPool();
        ExecutorService executor2 = Executors.newWorkStealingPool(5);
    }

    @Test
    void testRecursiveAction() throws InterruptedException {
        ForkJoinPool pool = ForkJoinPool.commonPool();
        List<Integer> integers = IntStream.range(0, 1000).boxed().collect(Collectors.toList());

        pool.execute(new SampleForkJoinTask(integers));

        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void testRecursiveTask() throws InterruptedException, ExecutionException {
        ForkJoinPool pool = ForkJoinPool.commonPool();
        List<Integer> integers = IntStream.range(0, 1000).boxed().collect(Collectors.toList());

        SampleRecursiveTask task = new SampleRecursiveTask(integers);
        ForkJoinTask<Long> submit = pool.submit(task);

        Long total = submit.get();
        System.out.println("Total: " + total);

        long check = integers.stream().mapToLong(value -> value).sum();
        System.out.println("Total: " + check);

        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.DAYS);
    }
}
