package com.it.program1;

public class Controls extends Furniture {
    private Furniture[] f;

    public Controls() {
        f = new Furniture[10];
        f[0] = new Furniture("吊灯");
        f[1] = new Furniture("电视机");
        f[2] = new Furniture("洗衣机");
        f[3] = new Furniture("落地窗");
    }

    public void select_(int id) {
        if (id > 0 && id < f.length && f[id - 1] != null) {
            System.out.println("您选择了" + f[id - 1].getName());
            System.out.println(f[id-1].getName() + "的状态是" +f[id-1].getStatus());
        }
    }

    public void switch_(int id, int state) {
        Furniture f1 = f[id - 1];
        if (id > 0 && id < f.length && f1 != null) {
            if (state == 1) {
                if (f1.isOn()) {
                    System.out.println("已经打开了，无需再打开");
                } else {
                    f1.setOn(true);
                    System.out.println(f1.getName() + "已打开");
                }
            } else if (state == 2) {
                if (f1.isOn()) {
                    f1.setOn(false);
                    System.out.println(f[id - 1].getName() + "已关闭");
                }else{
                    System.out.println("已经关闭了，无需再关闭");
                }
            }else{
                System.out.println("输入错误，只能输入1和2！");
            }
        } else {
            System.out.println("输入错误，请重新输入！");
        }
    }
}





