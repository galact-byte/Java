package com.it.interfaces;

public class Test {
    public static void main(String[] args) {
        C c = new C();
        c.go();
        c.run();
        c.play();
    }
}

class C implements A, B {
    @Override
    public void go() {
        System.out.println("这是go方法");
        ;
    }

    @Override
    public void run() {
        System.out.println("这是run方法");
    }

    @Override
    public void play() {
        System.out.println("这是play方法");
    }
}

