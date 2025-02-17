package com.it.program2;

import java.util.Scanner;

public class JdControl {
    private JdControl(){}
    private static final JdControl p=new JdControl();
    public static JdControl getInstance(){
        return p;
    }
    public void control(JD jd) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(jd.getName() + "当前的状态是:" + jd.isStatus());
            System.out.println("请输入 1.打开，2.关闭");
            int id = sc.nextInt();
            if (jd.change(id)) {
                return;
            }
        }
    }
//    public static void control(JD jd) {
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println(jd.getName() + "当前的状态是:" + jd.isStatus());
//            System.out.println("请输入 1.打开，2.关闭");
//            int id = sc.nextInt();
//            if (jd.change(id)) {
//                return;
//            }
//        }
//    }


    public void show(JD[] jds) {
        for (JD jd : jds) {
            if (jd != null) {
                System.out.println(jd.getName() + "当前的状态是:" + jd.isStatus());
                System.out.println();
            }
        }
    }
//    public  void show(JD[] jds) {
//        for (JD jd : jds) {
//            if (jd != null) {
//                System.out.println(jd.getName() + "当前的状态是:" + jd.isStatus());
//                System.out.println();
//            }
//        }
//    }
}
