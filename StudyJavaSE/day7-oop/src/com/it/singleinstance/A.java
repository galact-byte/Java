package com.it.singleinstance;

public class A {
    private A(){
    }
    private static A a = new A();
    public static A getA(){
        return a;
    }
}
