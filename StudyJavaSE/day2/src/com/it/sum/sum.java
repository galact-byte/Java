package com.it.sum;

public class sum {
    public static int max(int a, int b) {
        int max = a > b ? a : b;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2));
    }
}

