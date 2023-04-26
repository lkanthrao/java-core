package com.thread.synchronize;

public class ThreadMain {

	public static void main(String[] args) {

		SimpleRunnable sRunnable = new SimpleRunnable();
		
		Thread t1 = new Thread(sRunnable);
		t1.start();
		Thread t2 = new Thread(sRunnable);
		t2.start();
		
		
		
		
	}

}
