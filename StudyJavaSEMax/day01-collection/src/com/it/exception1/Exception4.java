package com.it.exception1;

public class Exception4 {
    public static void main(String[] args) {
        try {
            method(300);
        } catch (Exception e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
    }

    public static void method(int age) {
        if (age < 0 || age > 150) {
            throw new ItAgeillegalRuntimeException("年龄不合法");
        } else {
            System.out.println("年龄合法");
            System.out.println("保存年龄" + age);
        }
    }
}
