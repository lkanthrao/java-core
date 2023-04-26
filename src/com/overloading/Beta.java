package com.overloading;

class Baap {
    public int h = 4;

    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
}

public class Beta extends Baap {
    public int h = 44;

    @Override
    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }

    public static void main(String[] args) {
        Baap b = new Beta();
        System.out.println(b.h + " " + b.getH()); // this is AWESOME, Guess the output of this LK

//        Beta childObjectRefParent = new Baap(); java: incompatible types: com.overloading.Baap cannot be converted to com.overloading.Beta

        Beta bb = (Beta) b;
        System.out.println(bb.h + " " + bb.getH());


    }
}