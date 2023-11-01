package com.thread.synch;

class Table {

    void printTable(int n) {// method not synchronized
        synchronized (this) {
            System.out.println("--" + Thread.currentThread().getName());
        }

        try {
            Thread.sleep(400);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    synchronized void printTable(long n) {// method not synchronized
        synchronized (this) {
            System.out.println("--" + Thread.currentThread().getName());
        }

        try {
            Thread.sleep(400);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
