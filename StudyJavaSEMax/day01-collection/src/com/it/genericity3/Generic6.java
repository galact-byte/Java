package com.it.genericity3;

import java.util.ArrayList;

public class Generic6 {
    public static void main(String[] args) {
//        Integer i=new Integer(10);
        Integer i1=Integer.valueOf(10);
        Integer i2=Integer.valueOf(10);
        System.out.println(i1==i2);

        Integer i3=10;
        Integer i4=10;
        System.out.println(i3==i4);

        int i=i3;
        System.out.println(i);

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10); // 自动装箱
        list.add(20);

        int rs=list.get(1); // 自动拆箱

        System.out.println("=================");
        int j=10;
        String rs1=Integer.toString(j);
        System.out.println(rs1+1);

        Integer j2=j;
        String rs2=j2.toString();
        System.out.println(rs2+1);
        System.out.println("=================");

        String s="100";
//        int i5=Integer.parseInt(s);
        int i5=Integer.valueOf(s);
        System.out.println(i5+2);

        String s1="98.8";
        double d=Double.valueOf(s1);
        System.out.println(d+2);

    }
}
