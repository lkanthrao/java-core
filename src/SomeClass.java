public class SomeClass {
	public int i;

	public static void main(String argv[]) {
		SomeClass sc = new SomeClass();
//		System.out.println(i); java: non-static variable i cannot be referenced from a static context
		System.out.println(sc.i);
//		System.out.println(SomeClass.i); java: non-static variable i cannot be referenced from a static context
		System.out.println((new SomeClass()).i);
	}
}