package com.exception;

import java.io.PrintStream;

class NewException extends Exception {
	
	@Override
	public void printStackTrace(PrintStream s) {
		super.printStackTrace(s);
	}
	
	@Override
	public void printStackTrace() {
		super.printStackTrace();
	}
}

class AnotherException extends Exception {
}

public class ExceptionTest {
	public static void main(String[] args) throws Exception {
		try {
			m2();
		} finally {
			m3();
		}
	}

	public static void m2() throws NewException {
		throw new NewException();
	}

	public static void m3() throws AnotherException {
		throw new AnotherException();
	}
}