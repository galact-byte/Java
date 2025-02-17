package com.it.program;

public class A implements func {
    private Student[] s;

    public A(Student[] s) {
        this.s = s;
    }

    @Override
    public void printall() {
        for (int i = 0; i < s.length; i++) {
            Student stu = s[i];
            if (stu != null) {
                System.out.println("名字:" + stu.getName() + "\t性别:" + stu.getSex() + "\t成绩:" + stu.getGrade());
            }
        }
    }

    @Override
    public void average() {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                sum += s[i].getGrade();
                count++;
            }
        }
        System.out.println("平均成绩为：" + sum / count);

    }
}
