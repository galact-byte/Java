package com.it.array;

import java.util.Arrays;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入班级人数:");
        int people = sc.nextInt();
//        printScore(people);
        printScore1(people);
    }

    public static void printScore(int n) {
        Scanner sc = new Scanner(System.in);
        double[] score = new double[n];
        double result = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生的成绩:");
            score[i] = sc.nextDouble();
            result += score[i];
        }
        double result1 = result / n;
        System.out.println("平均成绩为:" + result1);
        Arrays.sort(score);
        System.out.println("最低分为:"+score[0]);
        System.out.println("最高分为:"+score[n-1]);
    }
    public static void printScore1(int n) {
        Scanner sc = new Scanner(System.in);
        double[] score = new double[n];
        double result = score[0];
        double max= score[0];
        double min= score[0];
        for (int i = 1; i < n; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生的成绩:");
            score[i] = sc.nextDouble();
            result += score[i];
            if(score[i]>max){
                max=score[i];
            }
            if(score[i]<min){
                min=score[i];
            }
        }
        double result1 = result / n;
        System.out.println("平均成绩为:" + result1);
        System.out.println("最低分为:"+min);
        System.out.println("最高分为:"+max);
//        Arrays.sort(score);
//        System.out.println("最低分为:"+score[0]);
//        System.out.println("最高分为:"+score[n-1]);
    }

}

