package com.it.object;

public class Student {
    String name;
    Double ChineseScore;
    Double MathScore;
    public void getScore(){
        System.out.println(name+"的总成绩是"+(ChineseScore+MathScore));
        System.out.println(name+"的平均成绩是"+(ChineseScore+MathScore)/2);
    }
}
