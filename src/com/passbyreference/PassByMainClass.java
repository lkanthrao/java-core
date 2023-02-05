package com.passbyreference;

public class PassByMainClass {

	public static void main(String[] args) {
		PersonClass obj = new PersonClass();

		obj.x = 2;
		obj.pString = "kanth";
		System.out.println(obj.x + obj.pString);
//		PassByMainClass pOb = new PassByMainClass();
//		pOb.exchange(obj);
		
		exchange(obj);
		System.out.println(obj.x + obj.pString);
	}

	public static void exchange(PersonClass pObj) {
		
//		pObj = new PersonClass();
		System.out.println(pObj.x + pObj.pString);
		
		pObj.x = 10;
		pObj.pString = "kanth2" ;
		
		System.out.println(pObj.x + pObj.pString);

	}

}
