package com.thread.synchronize;

public class SimpleRunnable implements Runnable {
	
	volatile String str = new String("Thread");

	synchronized void synchMethod() {
		System.out.println(str = "aaa");

	}

	synchronized void synchMethod1() {
		System.out.println(str);
	}
	
	void nonSynchMethod(){
		System.out.println(str);
	}

	@Override
	public void run() {
		this.synchMethod();
		this.nonSynchMethod();
	}
}
