package com.it.object;

public class Score {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "播妞";
        s1.ChineseScore = 100.0;
        s1.MathScore = 100.0;
        Student s2 = new Student();
        s2.name = "播仔";
        s2.ChineseScore = 59.0;
        s2.MathScore = 100.0;
//        printScore(s1);
//        printScore(s2);
        s1.getScore();
        s2.getScore();
    }
//    public static void printScore(Student s){
//        System.out.println("名字是:"+s.name);
//        if(s.ChineseScore%1==0) {
//            System.out.println("语文成绩是" + (int)(double)s.ChineseScore);
//        }
//        if(s.MathScore%1==0) {
//            System.out.println("数学成绩是" + (int)(double)s.MathScore);
//        }
//
//        System.out.println("平均成绩是:"+(s.ChineseScore+s.MathScore)/2.0);
//    }
}
