package com.it.loop;

import java.util.Scanner;

public class sum1 {
    //求1到任意整数的奇数和
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int input = sc.nextInt();
        System.out.println("结果为:" + sum1(input));
//        System.out.println("结果为:"+sum1_2(input));

    }

    //1.隔一个循环累加
    public static int sum1(int n) {
        int i, sum = 0;
        for (i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    //2.判断奇偶性
    public static int sum1_2(int n) {
        int i, sum = 0;
        for (i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
