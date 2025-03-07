package com.it.program;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        CardService service=new CardService();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请选择要使用的功能");
            System.out.println("1.存款");
            System.out.println("2.消费");
            System.out.println("3.退出");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("请输入要办理的卡:1.金卡 2.银卡");
                    int choice1=sc.nextInt();
                    service.firstput(choice1);
                    break;
                case 2:
                    System.out.println("请输入要消费的卡:1.金卡 2.银卡");
                    int choice2=sc.nextInt();
                    service.pay(choice2);
                    break;
                case 3:
                    System.out.println("退出成功");
                    System.exit(0);
            }
        }
    }

}
