package com.paralun.highlevel;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FutureTest {

    @Test
    void testFuture() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> callable = () -> {
            Thread.sleep(3000L);
            return "Hallo";
        };

        Future<String> future = executor.submit(callable);

        System.out.println("Future: " + future.get());
    }

    @Test
    void testFuture_cancel() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> callable = () -> {
            Thread.sleep(5000L);
            return "Hallo";
        };

        Future<String> future = executor.submit(callable);

        Thread.sleep(2000L);
        future.cancel(true);
        System.out.println("Future: " + future.get());
    }

    @Test
    void testFuture_invokeAll() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        List<Callable<String>> callables = IntStream.range(1, 11).mapToObj(value -> (Callable<String>) () -> {
            Thread.sleep(value * 500L);
            return String.valueOf(value);
        }).collect(Collectors.toList());

        List<Future<String>> futures = executor.invokeAll(callables);
        for (Future<String> future : futures) {
            System.out.println(future.get());
        }
    }

    @Test
    void testFuture_invokeAny() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        List<Callable<String>> callables = IntStream.range(1, 11).mapToObj(value -> (Callable<String>) () -> {
            Thread.sleep(value * 500L);
            return String.valueOf(value);
        }).collect(Collectors.toList());

        String value = executor.invokeAny(callables);
        System.out.println(value);
    }
}
