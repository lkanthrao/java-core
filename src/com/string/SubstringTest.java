package com.string;

public class SubstringTest {
	public static void main(String args[]) {
		String string = "string is a string";

		String stringWithoutNew = "string is a string";

		String string2 = new String("string is a string");

		if(string == string2) {
			System.out.println("== works well");
			System.out.println(string.substring(1, 5));
		}else if(string.equals(string2)){
			System.out.println("== doesn't works well with new operator, but with .equals");
		}
		else if(stringWithoutNew == string){
			System.out.println("== doesn't works well with new");
		}
		if(string.hashCode() == string2.hashCode()) { // INTERESTING LK
			System.out.println("hash code matches");
			System.out.println(string.substring(1, 5));

		}
		System.out.println(string.substring(4,8));//inclusive and exclusive
	}
}