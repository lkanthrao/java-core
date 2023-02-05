
public class Strings { 
	
	public static void main(String[] args) {
		String i = "abcd";
		
		System.out.println(i);
		
		i="def";
		System.out.println(i);
		StringBuffer b;
		StringBuilder bd;
		
		
		
		String firstLiteral = "Albacore Tuna";
		String secondLiteral = "Albacore Tuna";
		String firstObject = new String("Albacore Tuna");
		if(firstLiteral == secondLiteral) {
		System.out.println(
		"firstLiteral and secondLiteral are the same object");
		} else {
		System.out.println(
		"firstLiteral and secondLiteral are not the same object");
		}
		
		
		if(firstLiteral == firstObject) {
		System.out.println(
		"firstLiteral and firstObject are the same object");
		} else {
		System.out.println(
		"firstLiteral and firstObject are not the same object");
		}
		

		
		
		
		//		String str1 = "abc";
		String str1 = new String("abc");
		String str2 = new String("abc");
		str1.hashCode();
		if (str1 == str2)
			System.out.println("a");
		else
			System.out.println("b"); // because it's 2 different objects
		
		String str11 = "abcq";
		String str12 = "abc";
		String string = new String();
		string = "abc";
		
		if(str11 == str12)
			System.out.println("T");
		
		
		long ssn = 111_22_3333L;
		System.out.println(ssn);
		
		
	}

}
