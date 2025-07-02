package com.it.program;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        // 获取用户输入信息
        int age = inputAge();
        String sex = inputSex();
        double weight = inputWeight();
        double height = inputHeight();

        // 计算BMI
        double bmi = BMI(weight, height);
        System.out.println("您的BMI指数为: " + bmi);

        // 计算BMR
        double bmr = BMR(weight, height, age, sex);
        System.out.println("您的BMR指数为: " + bmr);
    }

    // 获取用户输入的年龄
    public static int inputAge() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年龄：");
        return sc.nextInt();
    }

    // 获取用户输入的性别
    public static String inputSex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入性别：");
        return sc.next();
    }

    // 获取用户输入的体重
    public static double inputWeight() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入体重（kg）：");
        return sc.nextDouble();
    }

    // 获取用户输入的身高
    public static double inputHeight() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入身高（cm）：");
        return sc.nextDouble();
    }

    // 计算BMI
    public static double BMI(double weight, double height) {
        // height单位是厘米，转换为米后进行计算
        height = height / 100;
        Double BMI= weight / (height * height);
        return Double.parseDouble(String.format("%.2f",BMI));
    }

    // 计算BMR
    public static double BMR(double weight, double height, int age, String sex) {
        // 如果是男生使用男性公式，女生使用女性公式
        if (sex.equals("男")) {
            return 10 * weight + 6.25 * height - 5 * age + 5;
        } else {
            return 10 * weight + 6.25 * height - 5 * age - 161;
        }
    }
}