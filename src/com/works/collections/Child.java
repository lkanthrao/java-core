package com.works.collections;

import java.io.IOException;

public class Child extends Parent {
    @Override
    public void method1() throws Exception {
        // TODO Auto-generated method stub
        super.method1();
        System.out.println("over ridden.........");
    }

    public void method1(int a, int b) throws IOException {
        System.out.println("over loaded.......");
    }

    public String method11() {
        System.out.println("over loaded.......");
        return "";
    }
}
