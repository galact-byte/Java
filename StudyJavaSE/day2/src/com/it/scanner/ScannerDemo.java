package com.it.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        input();

    }
    public static void input(){
        Scanner sc=new Scanner(System.in);
        String username=sc.next();
        System.out.println("欢迎:"+username);
        int age=sc.nextInt();
        System.out.println("年龄:"+age);
    }
}
