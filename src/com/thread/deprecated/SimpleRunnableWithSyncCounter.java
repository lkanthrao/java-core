package com.thread.deprecated;

public class SimpleRunnableWithSyncCounter extends Thread {

    SynchronizedCounter counter = new SynchronizedCounter();

    public static void main(String[] args) {
        new Thread(new SimpleRunnableWithSyncCounter()).start();
    }

    @Override
    public void run() {
        try {
            counter.increment();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Hello from a thread - " + SynchronizedCounter.c);
    }

}