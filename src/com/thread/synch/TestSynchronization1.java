package com.thread.synch;

class TestSynchronization1 {
    public static void main(String[] args) {
        Table obj = new Table();// only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
		
		/*Thread t2 = new Thread(new  Callable<V>() {

			@Override
			public V call() throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		});
		MyThread2 t2 = new MyThread2(obj);*/
        t1.start();
    }
}