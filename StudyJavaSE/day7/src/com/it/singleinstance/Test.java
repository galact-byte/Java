package com.it.singleinstance;

public class Test {
    public static void main(String[] args) {
        A a = A.getA();
        B b = B.getB();
        System.out.println(a);
        System.out.println(b);
    }
}
