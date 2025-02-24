package com.it.test;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lastInput=-1;
        int lastScore=-1;
        while(true){
            System.out.println("请输入这个人的成绩(1.优 2.良 3.中 4.及格),0选择退出:");
            int input = sc.nextInt();
            if(input==0){
                System.out.println("退出程序");
                break;
            }
            int currentScore = score(input);
            if(input == lastInput) {
                double avg = (currentScore + lastScore) / 2.0;  // 计算两个相同成绩的平均值
                System.out.println("连续输入相同成绩，平均值为: " + avg);
            }
            grade(input);
            if (currentScore != -1) {
                System.out.println("这个人的成绩是:" + currentScore);
            } else {
                System.out.println("输入有误,请输入1-4之间的数字");
            }
            lastInput = input;
            lastScore = currentScore;
        }
    }

    public static int score(int number) {
        switch (number) {
            case 1://优
                return (int) (Math.random() * 11) + 90;
            case 2://良
                return (int) (Math.random() * 11) + 80;
            case 3://中
                return (int) (Math.random() * 11) + 70;
            case 4://及格
                return (int) (Math.random() * 11) + 60;
            default:
                return -1;

        }
    }

    public static void grade(int number) {
        switch (number) {
            case 1:
                System.out.println("优秀");
                break;
            case 2://良
                System.out.println("良好");
                break;
            case 3://中
                System.out.println("中等");
                break;
            case 4://及格
                System.out.println("及格");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
