package com.it.interfaces1;

public class Test {
    public static void main(String[] args) {
        B b= new B();
        b.run();
        A.sleep();
    }
}
class B implements A{
//    @Override
//    public void run() {
//        System.out.println("B run");
//    }
}
