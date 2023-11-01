package com.thread.simplethreads;

public class ThreadOne extends Thread {

    int counter;

    @Override
    public void run() {
        try {
            System.out.println("before synch" + Thread.currentThread().getName());
            increment();
            System.out.println("after synch" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "--- end --" + counter);
    }

    public void increment() throws InterruptedException {
        sleep(10000);
        counter++;
        sleep(10000);
    }
}
