package com.it.innerclass;

public class test1 {
    private static String name;
    public static void show(){
        name = "张三";
        System.out.println(name);
    }

    public static void main(String[] args) {
        show();
    }
}
