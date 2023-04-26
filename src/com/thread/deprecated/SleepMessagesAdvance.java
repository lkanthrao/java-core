package com.thread.deprecated;
public class SleepMessagesAdvance {

	private void interrupt() throws InterruptedException {
		String importantInfo[] = {
				"Mares eat oats",
				"Does eat oats",
				"Little lambs eat ivy",
				"A kid will eat ivy too"
		};

		for (int i = 0;
				i < importantInfo.length;
				i++) {
			//Pause for 4 seconds
			Thread.sleep(4000);
			//Print a message
			System.out.println(importantInfo[i]);
		}
	}

	public void joinMethod() throws InterruptedException {

		Thread t = new Thread(new SimpleRunnableWithSyncCounter());
		t.start();
		t.join();// waits for t's thread to finish execution(die) and resumes this thread executoion,.
		System.out.println("main thread resumed");
	}

	private static void synchronizedMethod() {
		/*
		 * Here in debugging view,. first exe all the below lines which creates 3 threads in debuggin view
		 * and note: if the value of c in SynchronizedCounter is incremented then the same value gets updated in ALL
		 * threads that access c.
		 */
		SimpleRunnableWithSyncCounter t = new SimpleRunnableWithSyncCounter();
		t.start();
		SimpleRunnableWithSyncCounter t1 = new SimpleRunnableWithSyncCounter();
		t1.start();
		SimpleRunnableWithSyncCounter t2 = new SimpleRunnableWithSyncCounter();
		t2.start();/*
		t.interrupt();
		t1.interrupt();
		t2.interrupt();*/
	}

	public static void main(String args[]) throws InterruptedException {

		synchronizedMethod();


	}



}