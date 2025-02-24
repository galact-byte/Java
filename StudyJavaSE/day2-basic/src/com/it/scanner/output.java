package com.it.scanner;

import java.util.Scanner;

public class output {
    public static int input() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        return i;
    }

    public static void main(String[] args){
        System.out.println("请输入一个整数:");
        int a = input();
        System.out.println("结果是:"+a);
    }
}

