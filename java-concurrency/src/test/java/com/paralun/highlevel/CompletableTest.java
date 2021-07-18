package com.paralun.highlevel;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

public class CompletableTest {

    private ExecutorService executor = Executors.newFixedThreadPool(10);
    public Future<String> getValue() {
        CompletableFuture<String> future = new CompletableFuture<>();
        executor.execute(() -> {
            try {
                Thread.sleep(2000L);
                future.complete("Selesai");
            } catch (InterruptedException e) {
                future.completeExceptionally(e);
            }
        });

        return future;
    }

    @Test
    void testCompletable() throws ExecutionException, InterruptedException {
        Future<String> future = getValue();
        System.out.println(future.get());
    }

}
