package rao.subclass;

public class ChildClass extends ParentClass {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		
		ChildClass childPar = (ChildClass) new ParentClass(); // wont work
		
		ParentClass parent = new ParentClass();
		
		ParentClass parentchld = new ChildClass(); 
	}

}
