package com.it.strings;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s);
        String s1 = new String();
        System.out.println(s1);
        String s2 = new String("hello");
        System.out.println(s2);
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        String s3 = new String(ch);
        System.out.println(s3);

        System.out.println("==============================");
        Scanner sc = new Scanner(System.in);
        String okloginname = "admin";
        System.out.println("请输入你的用户名:");
        String name = sc.next();
        if (okloginname.equals(name)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
        System.out.println("==============================");
        String phone = sc.next();//18354678962
        String newphone = phone.substring(0, 3) + "****" + phone.substring(7);
        System.out.println(newphone);

    }
}
