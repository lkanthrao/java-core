package com.works.collections;

import java.util.Iterator;


public class MyColletions implements Iterable<String> {

    public static void main(String[] args) {
        AnotherClass1 a2 = new AnotherClass1();
        MyColletions a = new MyColletions();
        a.iterator1();
    }

    public AnotherClass1 iterator1() {
        AnotherClass1 a1 = new AnotherClass1();
        return a1;
    }

    @Override
    public Iterator<String> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public static class AnotherClass1 {
        static final String a = "hi";

        AnotherClass1() {
        }

    }
}
