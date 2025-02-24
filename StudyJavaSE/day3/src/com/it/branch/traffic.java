package com.it.branch;

import java.util.Scanner;

public class traffic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        traffic trafficlight = new traffic();
        System.out.println("请输入当前信号灯状态(red,yellow,green):");
        String lightInput = input.next().toLowerCase();
        switch (lightInput) {
            case "red":
                trafficlight.setLight(Light.RED);
                break;
            case "yellow":
                trafficlight.setLight(Light.YELLOW);
                break;
            case "green":
                trafficlight.setLight(Light.GREEN);
                break;
            default:
                System.out.println("输入错误");
        }
        trafficlight.displaystate();
    }

    //相当一个特殊的类，能当字段类型，表示一组有限的常量值
    enum Light {
        RED, GREEN, YELLOW
    }

    private Light currentLight;
    private boolean isMoving;

    //构造函数必须与类名保持一致
    public traffic() {
        currentLight = Light.RED;
        isMoving = false;
    }

    public void setLight(Light light) {
        currentLight = light;
        if (light == Light.RED) {
            isMoving = false;
        } else if (light == Light.GREEN) {
            isMoving = true;
        } else if (light == Light.YELLOW) {
            isMoving = false;
        } else {
            System.out.println("输入错误");
        }
    }

    public void displaystate() {
        System.out.println("当前信号灯状态是:" + currentLight);
        System.out.println("车辆状态:" + (isMoving ? "前进" : "停止"));
    }
}



