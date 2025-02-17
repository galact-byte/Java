package com.it.program;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要生成的验证码位数:");
        int n = sc.nextInt();
        String code = getCode(n);
        System.out.println("生成的验证码是:"+code);

    }
    public static String getCode(int n){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String code="";
        for(int i=0;i<n;i++){
            int index=(int)(Math.random()*str.length());
            code+=str.charAt(index);
        }
        return code;
    }
}
