package com.it.program;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
//        String okname="itheima";
//        String okpasswd="123456";
//        Scanner sc=new Scanner(System.in);
//        int count=0;
//        while(count<3){
//            System.out.println("请输入用户名：");
//            String name=sc.next();
//            System.out.println("请输入密码：");
//            String passwd=sc.next();
//            if(okname.equals(name)&&okpasswd.equals(passwd)){
//                System.out.println("欢迎进入系统！");
//            }else{
//                System.out.println("用户名或密码错误！");
//                count++;
//                if(count==3){
//                    System.out.println("你的账号已经被锁定！");
//                }else{
//                    System.out.println("还有"+(3-count)+"次机会！");
//                }
//            }
//        }
        Login l=new Login();
        l.login();


    }
}
