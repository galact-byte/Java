package com.it.loop;

import java.util.Scanner;

public class sum {
    //求1到任意整数的数据和
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数来表示求1到多少的和:");
        int input = sc.nextInt();
        System.out.println("结果为:" + sum(input));

    }

    public static int sum(int n) {
        int i, sum = 0;
        for (i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
