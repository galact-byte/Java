package com.it.program2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        JD[] jds = new JD[10];
        jds[0] = new TV("小米电视", true);
        jds[1] = new Windows("落地窗", true);
        jds[2] = new Washmachine("海尔洗衣机", true);
        jds[3] = new JD("LED灯", true);
        Scanner sc = new Scanner(System.in);
        JdControl jd=JdControl.getInstance();
        while (true) {
            System.out.println("请输入你的操作:");
            System.out.println("1.查看当前家庭设备的状态");
            System.out.println("2.打开/关闭某个设备的状态");
            System.out.println("3.退出");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
//                    JdControl.show(jds);
                    jd.show(jds);
                    break;
                case 2:
                    System.out.println("请输入你要打开/关闭的设备编号:");
                    System.out.println("1.小米电视 2.落地窗 3.海尔洗衣机 4.LED灯 ");
                    int id = sc.nextInt();
//                    JdControl.control(jds[id - 1]);
                    jd.control(jds[id - 1]);
                    break;
                case 3:
                    System.out.println("退出成功");
                    System.exit(0);
            }
        }
    }
}
