package com.it.singleinstance;

public class B {
    private B(){
    }
    private static B b;
    public static B getB(){
        if (b==null){
            b=new B();
        }
        return b;
    }
}
