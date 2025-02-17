package com.it.loop;

public class chengfa {
    public static void main(String[] args) {
        print99();
    }

    //九九乘法表
    public static void print99() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }

}
