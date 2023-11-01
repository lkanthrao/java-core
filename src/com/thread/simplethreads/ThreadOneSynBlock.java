package com.thread.simplethreads;

public class ThreadOneSynBlock extends Thread {

    int counter;

    @Override
    public void run() {
        System.out.println("before synch" + Thread.currentThread().getName());
        synchronized (this) {
            System.out.println("in synch" + Thread.currentThread().getName());
            try {
                sleep(10000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("here synch" + Thread.currentThread().getName());
        }
        System.out.println("after synch" + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName() + "---" + counter);
        try {
            sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "--- end");
    }

    public synchronized void increment() {
        counter++;
    }
}
