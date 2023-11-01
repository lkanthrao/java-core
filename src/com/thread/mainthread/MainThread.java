package com.thread.mainthread;


import com.thread.simplethreads.ThreadOne;

public class MainThread {

    public static void main(String[] args) {
        System.out.println("Started..");
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();
        ThreadOne threadtwo = new ThreadOne();
        threadtwo.start();
        ThreadOne threadthree = new ThreadOne();
        threadthree.start();
		/*ThreadTwo threadTwo = new ThreadTwo();
		threadTwo.start();*/
    }

    //kanth this method will not be executed.
    public static void main() {
        System.out.println("Started..");
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();
        ThreadOne threadTwo = new ThreadOne();
        threadTwo.start();
    }
}
