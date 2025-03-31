package com.it.genericity;

public class Generic2 {
    public static void main(String[] args) {
        MyArrayList<String> list1=new MyArrayList<String>();
        list1.add("hello");
        list1.add("world");
        list1.add("java");
        System.out.println(list1.remove("java"));
        System.out.println(list1);
    }
}
