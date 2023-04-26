package com.thread.deprecated;
public class SynchronizedCounter {


	public static int c = 0;

	public synchronized void increment() throws InterruptedException {
		c++;
		System.out.println("before sleep - " + Thread.currentThread().getName() + "---"+c);
		Thread.currentThread().sleep(3000);
		System.out.println("after sleep - " + Thread.currentThread().getName() + "---"+c);

	}

	public synchronized void decrement() {
		c--;
		System.out.println(Thread.currentThread().getName());
	}

	public synchronized int value() {
		//		System.out.println(Thread.currentThread().getName() + c);
		return c;
	}
}