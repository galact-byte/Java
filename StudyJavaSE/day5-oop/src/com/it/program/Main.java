package com.it.program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieService movies = new MovieService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择要执行的操作:");
            System.out.println("1.显示所有电影");
            System.out.println("2.选择要查看的电影信息(输入id)");
            System.out.println("3.退出");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    movies.display();
                    break;
                case 2:
                    System.out.println("请输入要查看的电影id:");
                    int id = sc.nextInt();
                    movies.displayById(id);
                    break;
                case 3:
                    System.out.println("退出成功");
                    System.exit(0);
                default:
                    System.out.println("输入错误，请重新输入");
                    break;

            }
        }
    }
}
