package test;

import ii.annot.AnnotHandler;
import ii.annot.MyOverride;

public class AnnotTest extends ParentClass{


	@MyOverride
	public String sayHello1()
	{
		return "Hello....";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotTest o = new AnnotTest();
		System.out.println("hi...");
		new AnnotHandler();
	}

}
