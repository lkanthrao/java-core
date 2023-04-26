package com.constructors;

class MySuper {
    public MySuper(int i) {
    }
}

class nonAbstractSub extends MySuper {

	public nonAbstractSub(int i) {
		super(i);
	}
}

abstract class MySub extends MySuper {
    public MySub(int i) {
        super(i);
    }

    public abstract void m1();
}

class MyTest1 {
    public static void main(String[] args) {
        MySub ms = new MySub(1) {
            @Override
            public void m1() {
                System.out.println("In MySub.m1()");
            }
        };
        ms.m1();

//		NonAbstractSub nonAbstractSub = new MySuper(1); child class cannot refer parent calss, as there may be new properties in
//		child which are not there in parent. Because there could you chaange of childObj.parentObjectMethod();
    }
}