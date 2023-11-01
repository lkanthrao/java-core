package com.thread.simplethreads;

public class ThreadTwo extends Thread {

    @Override
    public void run() {
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("thread two" + Thread.currentThread().getName());
    }

}
