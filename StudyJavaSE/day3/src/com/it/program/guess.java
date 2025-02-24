package com.it.program;

import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        int guess= (int)(Math.random() * 100)+1;
        System.out.println("系统已经生成一个数字，请开始猜测！");
        Scanner sc= new Scanner(System.in);
        guessNumber(guess,sc);
    }
    public static void guessNumber(int guess,Scanner sc) {
        int count=0;
        while (true) {
            System.out.print("请输入你猜的数字:");
            int userGuess = sc.nextInt();

            if (guess>userGuess) {
                System.out.println("猜小了");
                count++;
            }else if (guess<userGuess){
                System.out.println("猜大了");
                count++;
            }else {
                System.out.println("恭喜你，猜对了");
                break;
            }
            if(count>30){
                System.out.println("你太笨了，猜了"+count+"次");
                System.out.println("正确答案是"+guess);
                break;
            }
        }
    }
}
