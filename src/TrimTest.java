import java.util.Collections;
import java.util.Iterator;

public class TrimTest {
	public static void main(String args[]) {
		String blank = " "; // one space
		String line = blank + "hello" + blank + blank;
		line.concat("world");
		String newLine = line.trim();
		System.out.println((int) (line.length() + newLine.length()));
	}

	private void mtdh() {
		// TODO Auto-generated method stub
		int b = 0,c = 0 ;
		String a = null;
		System.out.println(a);
	}
}