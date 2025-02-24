package com.it.javabean;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("波妞",100,100);
        Student s2 = new Student("波仔",59,80);
        StudentService operator = new StudentService();
        operator.allscore(s1);
        operator.allscore(s2);
        operator.avgscore(s1);
        operator.avgscore(s2);
    }
}
