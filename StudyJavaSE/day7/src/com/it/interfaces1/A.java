package com.it.interfaces1;

public interface A {
    // 默认方法 普通实例方法
    default void run(){
        System.out.println("A");
        eat();
    }
    private void eat(){
        System.out.println("A eat");
    }
    static void sleep(){
        System.out.println("A sleep");
    }
}
