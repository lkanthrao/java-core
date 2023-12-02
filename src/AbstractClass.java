import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractClass implements Interface {
	
	List<String> a = new ArrayList<String>();
	
	private void method1() {
		System.out.println(a);
	}
	
	public  void Draw(){    
		a = Collections.singletonList("aa");
		System.out.println(a);
		
	};
	
}
