package com.it.program;

import java.util.Scanner;

public class identity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要指定生成的验证码长度:");
        int input = sc.nextInt();
        System.out.print("生成结果1为:" + stringcode(input));
        System.out.println();
        System.out.print("生成结果2为:" + getCode(input));
    }

    //1.字符集然后随机生成验证码
    public static String stringcode(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
//        System.out.println(characters.length());
        String password = "";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            password += characters.charAt(index);
        }
        return password;
    }

    //2.使用条件判断和ascii码来生成验证码
    public static String getCode(int n) {
        String code = "";
        for (int i = 0; i < n; i++) {
            int type = (int) (Math.random() * 3);
            switch (type) {
                case 0:
                    code += (int) (Math.random() * 10);
                    break;
                case 1:
                    code += (char) ('A' + (int) (Math.random() * 26));
                    break;
                case 2:
                    code += (char) ('a' + (int) (Math.random() * 26));
                    break;
            }
        }
        return code;
    }

}
