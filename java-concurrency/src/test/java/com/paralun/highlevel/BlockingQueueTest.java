package com.paralun.highlevel;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.concurrent.*;

public class BlockingQueueTest {

    @Test
    void testArrayBlockingQueue() throws InterruptedException {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
        ExecutorService executor = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 10; i++) {
            executor.execute(() -> {
                try {
                    queue.put("Data");
                    System.out.println("Success Put Data");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.execute(() -> {
            while (true) {
                try {
                    Thread.sleep(2000L);
                    String data = queue.take();
                    System.out.println("Receive: " + data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executor.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void testLinkedBlockingQueue() throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingDeque<>();
        ExecutorService executor = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 10; i++) {
            executor.execute(() -> {
                try {
                    queue.put("Data");
                    System.out.println("Success Put Data");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.execute(() -> {
            while (true) {
                try {
                    Thread.sleep(2000L);
                    String data = queue.take();
                    System.out.println("Receive: " + data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executor.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void testPriorityBlockingQueue() throws InterruptedException {
        BlockingQueue<Integer> queue = new PriorityBlockingQueue<>(10, Comparator.reverseOrder());
        ExecutorService executor = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 10; i++) {
            int index = i;
            executor.execute(() -> {
                try {
                    queue.put(index);
                    System.out.println("Success Put Data: " + index);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.execute(() -> {
            while (true) {
                try {
                    Thread.sleep(2000L);
                    Integer data = queue.take();
                    System.out.println("Receive: " + data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executor.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void testDelayQueue() throws InterruptedException {
        BlockingQueue<ScheduledFuture<String>> queue = new DelayQueue<>();
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(10);

        for (int i = 0; i < 10; i++) {
            queue.put(executor.schedule(() -> "Delayed", i, TimeUnit.SECONDS));
        }

        executor.execute(() -> {
            while (true) {
                try {
                    Thread.sleep(2000L);
                    ScheduledFuture<String> data = queue.take();
                    System.out.println("Receive: " + data.get());
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
        });

        executor.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void testSynchronousQueue() throws InterruptedException {
        BlockingQueue<String> queue = new SynchronousQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 10; i++) {
            int index = i;
            executor.execute(() -> {
                try {
                    queue.put("Data-" + index);
                    System.out.println("Success Put Data: " + index);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.execute(() -> {
            while (true) {
                try {
                    Thread.sleep(2000L);
                    String data = queue.take();
                    System.out.println("Receive: " + data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executor.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void testBlockingDeque() throws InterruptedException {
        BlockingDeque<String> queue = new LinkedBlockingDeque<>();
        ExecutorService executor = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 10; i++) {
            int index = i;
            executor.execute(() -> {
                try {
                    queue.putLast("Data-" + index);
                    System.out.println("Success Put Data: " + index);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.execute(() -> {
            while (true) {
                try {
                    Thread.sleep(2000L);
                    String data = queue.takeLast();
                    System.out.println("Receive: " + data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executor.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void testTransferQueue() throws InterruptedException {
        TransferQueue<String> queue = new LinkedTransferQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 10; i++) {
            int index = i;
            executor.execute(() -> {
                try {
                    queue.transfer("Data-" + index);
                    System.out.println("Success Put Data: " + index);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.execute(() -> {
            while (true) {
                try {
                    Thread.sleep(2000L);
                    String data = queue.take();
                    System.out.println("Receive: " + data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
