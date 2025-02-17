package com.it.constructor;

public class Student {
    String name;
    int age;
    String sex;
    public Student(){
        System.out.println("无参构造方法");
    }
    public Student(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
}
