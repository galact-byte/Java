package com.it.program1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Controls f = new Controls();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要选择的功能");
            System.out.println("1.控制家用设备");
            System.out.println("2.退出");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("请输入要控制的设备:");
                    System.out.println("1.吊灯、2.电视、3.洗衣机 4.落地窗");
                    int id1 = sc.nextInt();
                    f.select_(id1);
                    System.out.println("请确定其是否开关:");
                    System.out.println("1.开 2.关");
                    int id2= sc.nextInt();
                    f.switch_(id1,id2);
                    break;
                case 2:
                    System.out.println("退出成功");
                    System.exit(0);
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }
    }
}
