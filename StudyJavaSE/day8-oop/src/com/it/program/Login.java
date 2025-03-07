package com.it.program;

import java.util.Scanner;

public class Login {
    private static final String OK_NAME = "itheima";
    private static final String OK_PASSWD = "123456";

    public void login() {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while (count < 3) {
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String passwd = sc.next();
            if (OK_NAME.equals(name) && OK_PASSWD.equals(passwd)) {
                System.out.println("欢迎进入系统！");
                return;
            } else {
                System.out.println("用户名或密码错误！");
                count++;
                printinfo(count);
            }
        }
    }

    public void printinfo(int count) {
        if (count == 3) {
            System.out.println("你的账号已经被锁定！");
        } else {
            System.out.println("还有" + (3 - count) + "次机会！");
        }
    }
}
