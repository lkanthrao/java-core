package test;
import java.security.AccessController;
import java.security.PrivilegedAction;
public class AccessSystemProperty {
	public static void main(String[] args) {
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getSecurityManager());
		AccessController.doPrivileged(
				new PrivilegedAction<Boolean>(){
					public Boolean run(){
						System.out.println(System.getProperty("java.home"));
						return Boolean.TRUE;
					}
				}
		);
	}
}