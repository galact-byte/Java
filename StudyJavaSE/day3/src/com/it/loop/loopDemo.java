package com.it.loop;

import java.util.Scanner;

/**
 * 在控制台输出水仙花数，要求：
 * 1.必须是一个三位数。
 * 2.个位、十位、百位上的数字立方和等于原数字
 */
public class loopDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int input = sc.nextInt();
        System.out.println("水仙花个数可能为:");
        flowers(input);
        System.out.println("数量为:" + flowers1(input));

    }

    public static void flowers(int n) {
        if (n < 100 || n > 999) {
            System.out.println("输入的数字不符合要求");
            return;
        }
        for (int i = 100; i <= n; i++) {
            if (i == (int) (Math.pow(i / 100, 3) + Math.pow(i % 100 / 10, 3) + Math.pow(i % 100 % 10, 3))) {
                System.out.println(i);
            }
        }
    }

    public static int flowers1(int n) {
        if (n < 100 || n > 999) {
            System.out.println("输入的数字不符合要求");
            return 0;
        }
        int count = 0;
        for (int i = 100; i <= n; i++) {
            if (i == (int) (Math.pow(i / 100, 3) + Math.pow(i % 100 / 10, 3) + Math.pow(i % 100 % 10, 3))) {
//                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}


