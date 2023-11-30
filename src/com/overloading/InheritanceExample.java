package com.overloading;

class Parent {
    public int age = 38;

    public int getAge() {
        System.out.println("Parent " + age);
        return age;
    }
}

class Child extends Parent {
    public int age = 8;

    @Override
    public int getAge() {
        System.out.println("Child age method " + age);
        return age;
    }
}

public class InheritanceExample {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Parent();

        Parent parentVarAsChildObj = child;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("child - ").append(child.age)
                .append("\nparent - ").append(parent.age)
                .append("\nparentVarAsChildObj - ").append(parentVarAsChildObj.age)
                .append("\ntoAccessChildAgeThroughParentVar - ").append(parentVarAsChildObj.getAge())
        ;

        /*
        Child age method 8 //LK: this is print first than the below one.
        child - 8
        parent - 38
        parentVarAsChildObj - 38
        toAccessChildAgeThroughParentVar - 8
        */

        System.out.println(stringBuilder);

    }
}