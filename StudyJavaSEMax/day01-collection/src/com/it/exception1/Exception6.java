package com.it.exception1;

import java.util.Scanner;

public class Exception6 {
    public static void main(String[] args) {
        while (true) {
            try {
                double price = userInputPrice();
                System.out.println("价格是：" + price + "元");
                break;
            } catch (Exception e) {
    //            throw new RuntimeException(e);
                e.printStackTrace();
            }
        }
    }

    public static double userInputPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入价格：");
        double price = sc.nextDouble();
        return price;
    }
}
