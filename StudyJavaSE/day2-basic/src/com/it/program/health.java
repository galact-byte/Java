/**
 * * 根据用户输入内容，计算BMI指数和BMR指数
 **/
package com.it.program;

import java.util.Scanner;

public class health {
    public static void main(String[] args) {
        String input = input();
        String[] data = input.split(" ");
        int age = Integer.parseInt(data[0]);
        String sex = data[1];
        double weight = Double.parseDouble(data[2]);
        double height = Double.parseDouble(data[3]);
        double bmi = BMI(weight, height);
        System.out.print("您的BMI指数为" + bmi + '\n');
        double bmr = BMR(weight, height, age, sex);
        System.out.print("您的BMR指数为" + bmr);

    }

    //1.输入年龄、性别、体重、身高
    public static String input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年龄(岁):");
        int age = sc.nextInt();
        System.out.print("请输入性别(男/女):");
        String sex = sc.next();
        System.out.print("请输入体重(kg):");
        double weight = sc.nextDouble();
        System.out.print("请输入身高(cm):");
        double height = sc.nextDouble();
        return age + " " + sex + " " + weight + " " + height;
    }

    //2.计算BMI指数
    public static double BMI(double weight, double height) {
        height /= 100;
        double result = weight / (height * height);
        return Double.parseDouble(String.format("%.2f", result));
    }

    //3.计算BMR指数
    public static double BMR(double weight, double height, int age, String sex) {
        double result = 0;
        if (sex.equals("男")) {
            result = (10 * weight + 6.25 * height - 5 * age + 5);
        } else {
            result = (10 * weight + 6.25 * height - 5 * age - 161);
        }
        return result;
    }
}
