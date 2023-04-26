package com.constructors;

import com.works.collections.Parent;

public class ObjectLifeCycle {


	public static void main(String[] args) throws Exception {
		Parent parentObj = new Parent();
		parentObj.method1();

		TestClass obj = new TestClass();
		ProcessBuilder aa = new  ProcessBuilder("run");
		//		aa.start();
	}

}
