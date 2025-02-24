package com.it.program;

import java.util.Scanner;

//做一个简单的计算器
public class Calc {
    public static void main(String[] args) {
        String input = input();
        String[] data = input.split(" ");
        double a = Double.parseDouble(data[0]);
        double b = Double.parseDouble(data[1]);
        String operator = data[2];
        calculate(a, b, operator);

    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数字:");
        double num1 = sc.nextDouble();
        System.out.print("请输入第二个数字:");
        double num2 = sc.nextDouble();
        System.out.print("请输入运算符(加减乘除):");
        String operator = sc.next();
        return num1 + " " + num2 + " " + operator;
    }

    public static void calculate(double a, double b, String operator) {
        switch (operator) {
            case "+":
                print(a + b);
                break;
            case "-":
                print(a - b);
                break;
            case "x":
            case "*":
                print(a * b);
                break;
            case "/":
                if (b != 0) {
                    print(a / b);
                } else {
                    System.out.println("除数不能为0");
                }
                break;
            default:
                System.out.println("输入错误");
        }
    }

    public static void print(double result) {
        if (result == (int) result) {
            System.out.println("结果为:" + (int) result);
        } else {
            System.out.println("结果为:" + result);
        }
    }
}
