package com.it.method;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        Student[] s = new Student[6];
        //倚天屠龙记
        s[0] = new Student("张无忌", 18, "男",175);
        s[1] = new Student("张三丰", 100, "男",180);
        s[2] = new Student("张翠山", 50, "男", 170);
        //神雕侠侣
        s[3] = new Student("郭靖", 20, "男", 174);
        s[4] = new Student("黄蓉", 22, "女", 165);
        s[5] = new Student("杨过", 16, "男", 172);
//        Arrays.sort(s, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                if(o1.getAge() > o2.getAge()){
////                    return 1;
////                }else if(o1.getAge()< o2.getAge()){
////                    return -1;
////                }
////                return 0;
////                return o1.getAge() - o2.getAge();
//                return o2.getAge() - o1.getAge();
//            }
//        });
//        Arrays.sort(s,(o1,o2)->Student.compareStudentByAge(o1,o2) );
        Arrays.sort(s,Student::compareStudentByAge);
        Student t=new Student();
//        Arrays.sort(s,(o1,o2)->t.compareStudentByHeight(o1,o2));
        Arrays.sort(s,t::compareStudentByHeight);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
