package com.paralun.data;

public class Counter {

    private Long value = 0L;

    // Race Condition
    public void increment() {
        value++;
    }

    // Mengatasi masalah Race Condition
    public synchronized void increment2() {
        value++;
    }

    // Synchronized Statement
    public void increment3() {
        synchronized (this) {
            value++;
        }
    }

    public Long getValue() {
        return value;
    }
}
