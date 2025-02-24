package com.it.program;

import java.util.Scanner;

public class number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入起始数字:");
        int n = sc.nextInt();
        System.out.print("请输入结束数字:");
        int m = sc.nextInt();
        System.out.print("从"+n+"到"+m+"之间的素数有:");
        primenumber(n,m);

    }
    public static void primenumber(int n,int m){
        for (int i=n;i<=m;i++){
            if(i==1){
                continue;
            }
            boolean flag=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.print(i+" ");
            }
        }
    }
}

