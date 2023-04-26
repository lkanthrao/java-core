package com.objects;

public class StaticTrails {

    static StaticTrails staticObj = new StaticTrails();
    final StaticTrails nonNtatic = new StaticTrails();



	{
        /*
        * so from static block we can invoke 
        * */
        int i = 0;
        staticM();
//        nonNtatic = new StaticTrails(); java: cannot assign a value to final variable nonNtatic
		NonstaticM(); //java: non-static method NonstaticM() cannot be referenced from a static context
    }

	static {
		staticM();
//        nonNtatic = new StaticTrails(); java: cannot assign a value to final variable nonNtatic
//		NonstaticM(); //java: non-static method NonstaticM() cannot be referenced from a static context
	}

    static public Object staticM() {
//		staticObj = new StaticTrails(); // comp err final cannot be modified. 
//		nonNtatic = new StaticTrails(); // comp err static cannot be accessed.
        return null;
    }

    public Object NonstaticM() {
        staticObj = new StaticTrails();
//		nonNtatic = new StaticTrails();
        return null;
    }

    public static void main(String[] args) {

        /*
        *
        * Exception in thread "main" java.lang.StackOverflowError
        *
        * */
    }

}
