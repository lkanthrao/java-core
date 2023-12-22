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

    public void canIThrowCheckedWithNoTrows() throws NewException {
        throw new NewException();
    }

    public void canIThrowUncheckedWithNoTrows() { //LK: here throws in method signature is not required,
        // as it's a runtime exception. And any subclasses of Runtime Exception no need to throws.
        throw new NullPointerException();

        /*
        * LK:
        * The Throwable class is the superclass of all errors and exceptions in the Java language.
        * Only objects that are instances of this class (or one of its subclasses) are thrown by
        * the Java Virtual Machine or can be thrown by the Java throw statement. Similarly,
        * only this class or one of its subclasses can be the argument type in a catch clause.
        * For the purposes of compile-time checking of exceptions, Throwable and any subclass of
        * Throwable that is not also a subclass of either RuntimeException or Error are regarded as checked exceptions
        *
        * */
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