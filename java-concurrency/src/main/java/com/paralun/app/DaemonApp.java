package com.paralun.app;

public class DaemonApp {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(3000L);
                System.out.println("Thread");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // false : thread akan di tungguin sampai selesai
        // true : thread tidak akan di tungguin
        thread.setDaemon(true);
        thread.start();
    }
}
