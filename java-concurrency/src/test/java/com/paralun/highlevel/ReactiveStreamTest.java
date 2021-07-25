package com.paralun.highlevel;

import com.paralun.data.PrintSubscriber;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;

public class ReactiveStreamTest {

    @Test
    void testPublisher() throws InterruptedException {
        PrintSubscriber subscriber1 = new PrintSubscriber(1000L, "SUB1");
        PrintSubscriber subscriber2 = new PrintSubscriber(500L, "SUB2");

        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);

        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.execute(() -> {
            for (int i = 0; i < 20; i++) {
                publisher.submit("Item-" + i);
                System.out.println("Send Item-" + i);
            }
        });

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);

        Thread.sleep(25 * 1000);
    }
}
