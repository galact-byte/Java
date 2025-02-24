package com.it.array;

import java.util.Scanner;

public class Seat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入行数:");
        int m = sc.nextInt();
        System.out.print("请输入列数:");
        int n = sc.nextInt();
        sc.nextLine();
        String[][] seat = new String[m][n];
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                System.out.print("请输入第" + (i + 1) + "行第" + (j + 1) + "列学生的姓名:");
                seat[i][j] = sc.nextLine().trim();
                if (seat[i][j].isEmpty()) {
                    seat[i][j] = " ";
                }
            }
        }
        printSeat(seat);
        System.out.println("随机排列座位后:");
        shuffle(seat);
        printSeat(seat);
    }

    //存储班级座位上的学生名称，输出学生名称时能直观看到位置，用二维数组存储
    public static void printSeat(String[][] seat) {
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                System.out.print(seat[i][j] + "\t");
                if (seat[i][j] == " ") {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void shuffle(String[][] seat) {
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                int x = (int) (Math.random() * seat.length);
                int y = (int) (Math.random() * seat[i].length);
                String temp = seat[i][j];
                seat[i][j] = seat[x][y];
                seat[x][y] = temp;
            }

        }
    }
}
