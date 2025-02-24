package com.it.javabean;

public class StudentService {
    public void allscore(Student s){
        System.out.println(s.getName()+"的总分是"+(s.getChinese()+s.getMath()));
    }
    public void avgscore(Student s){
        System.out.println(s.getName()+"的平均分是"+(s.getChinese()+s.getMath())/2);
    }
}
