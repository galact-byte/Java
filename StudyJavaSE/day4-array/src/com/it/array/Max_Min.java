package com.it.array;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入班级人数:");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生的成绩:");
            arr[i] = sc.nextDouble();
        }
        maxMin(arr);
    }

    public static void maxMin(double[] arr) {
        double max = arr[0];
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        if(max==(int)max){
            System.out.println("最大值为:" + (int)max);
        }else{
            System.out.println("最大值为:" + max);
        }
        if(min==(int)min){
            System.out.println("最小值为:" + (int)min);
        }else{
            System.out.println("最小值为:" + min);
        }
    }
}
