package com.paralun.data;

public class Balance {

    private Long value;

    public Balance(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public static void transferDeadlock(Balance from, Balance to, Long value) throws InterruptedException {
        // Lock Balance from
        synchronized (from) {
            Thread.sleep(1000L);
            // Lock Balance to
            synchronized (to) {
                Thread.sleep(1000L);
                from.setValue(from.getValue() - value);
                to.setValue(to.getValue() + value);
            }
        }
    }

    public static void transfer(Balance from, Balance to, Long value) throws InterruptedException {
        // Lock Balance from
        synchronized (from) {
            Thread.sleep(1000L);
            from.setValue(from.getValue() - value);
        }

        // Lock Balance to
        synchronized (to) {
            Thread.sleep(1000L);
            to.setValue(to.getValue() + value);
        }
    }
}
