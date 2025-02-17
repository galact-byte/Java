package com.it.constructor;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18,"男");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.sex);
        Student s2 = new Student();
        s2.name = "李四";
        System.out.println(s2.name);
    }
}
