package com.it.loop;

//本金是10w，复利率是1.7%，需要多久才能翻倍
public class WhileDemo {
    public static void main(String[] args) {
        System.out.print("需要时间为:" + loop() + "年");

    }

    public static int loop() {
        double money = 100000;
        double rate = 0.017;
        int year = 0;
        double v = money * 2;
        while (money < v) {
            money = money * Math.pow((1 + rate), 1);
            year++;
        }
        return year;
    }
}
