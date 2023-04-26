package com.thread.practice;

public class PracticeThreads {

    public static void main(String[] args) {

//        Runnable runnableThread = new Thread("Thread-Practice");

        System.out.println("Before thread Initialize");

        Runnable runnableThread = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Runnable thread");
            }
        };

        System.out.println("After thread Initialize");

        //        runnableThread.run(); this is just as same as calling method of an object, this will not create a thread

        Thread thread = new Thread(runnableThread);
        thread.start();
        System.out.println("After run of thread");
    }

}

class PracticeThreads1 extends Thread {

    @Override
    public void run() {
        try {
            sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread executed");
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("main");
        PracticeThreads1 practiceThreads1 = new PracticeThreads1();

        practiceThreads1.start();

        sleep(20000);

        System.out.println("main end");
    }
}
