package com.thread.synch;

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
        System.out.println("thread 1 run");
    }
}