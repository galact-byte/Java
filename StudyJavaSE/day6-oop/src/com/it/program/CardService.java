package com.it.program;

import java.util.Scanner;

public class CardService {
    private static double discount;
    GoldCard card1 = new GoldCard();
    SilverCard card2 = new SilverCard();
    Scanner sc = new Scanner(System.in);

    public void firstput(int id) {
        System.out.print("请输入办理金额:");
        switch (id) {
            case 1:
                double money1 = sc.nextDouble();
                card1.firstput(money1);
                card1.setRemain(money1);
                break;
            case 2:
                double money2 = sc.nextDouble();
                card2.firstput(money2);
                card2.setRemain(money2);
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }

    public void pay(int id) {
        System.out.print("请输入消费金额:");
        switch (id) {
            case 1:
                double cost = sc.nextDouble();
                card1.pay(cost);
                break;
            case 2:
                double cost2 = sc.nextDouble();
                card2.pay(cost2);
                break;
        }
    }
}
