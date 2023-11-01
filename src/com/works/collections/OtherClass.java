package com.works.collections;

import com.works.collections.MyColletions.AnotherClass1;

public class OtherClass implements Runnable {
    AnotherClass1 aa = new AnotherClass1();
    Thread myThread = new Thread();

    public static void main(String[] args) {
        OtherClass otherCls = new OtherClass();
        otherCls.myThread.run();
    }

    @Override
    public void run() {
        System.out.println("hi");
    }
}
