package com.it.array;

import java.util.Scanner;

public class Puzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入行列数:");
        int n = sc.nextInt();
        puzzle(n);
    }

    public static void puzzle(int n) {
        int[][] arr = new int[n][n];
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = count++;
            }
        }
        print(arr);
        System.out.println("打乱后为:");
        shuffle(arr);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }
        for(int[] row : arr){
            for(int data : row){
                System.out.print(data+"\t");
            }
            System.out.println();
        }
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void shuffle(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int x= (int)(Math.random()*arr.length);
                int y= (int)(Math.random()*arr[i].length);
                int temp = arr[i][j];
                arr[i][j] = arr[x][y];
                arr[x][y] = temp;
            }
        }
    }
}
