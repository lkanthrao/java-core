package com.works.collections;


public class Parent {
	public void method1() throws Exception {
		System.out.println("method1........");
	}

	@Override
	protected void finalize() throws Throwable {
//		super.finalize();
		System.out.println("");
	}
}
