package com.paralun.data;

import java.util.concurrent.Flow;

public class PrintSubscriber implements Flow.Subscriber<String> {

    private Flow.Subscription subscription;

    private Long sleep;
    private String name;

    public PrintSubscriber(Long sleep, String name) {
        this.sleep = sleep;
        this.name = name;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1);
    }

    @Override
    public void onNext(String item) {
        try {
            Thread.sleep(sleep);
            System.out.println(Thread.currentThread().getName() + " | " + name + ":" + item);
            this.subscription.request(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println(Thread.currentThread().getName() + " DONE");
    }
}
