package com.it.program;

public class B implements func {
    private final Student[] s;

    public B(Student[] s) {
        this.s = s;
    }

    @Override
    public void printall() {
        int count1 = 0;
        int count2 = 0;
        for (Student student : s) {
            if (student != null) {
                System.out.println("名字:" + student.getName() + "\t性别:" + student.getSex() + "\t成绩:" + student.getGrade());
                if (student.getSex() == "男") {
                    count1++;
                } else {
                    count2++;
                }
            }
        }
        System.out.println("男生人数:" + count1 + "\t女生人数:" + count2);
    }

    @Override
    public void average() {
        int count = 1;
        Student s1 = s[0];
        double sum = s1.getGrade();
        double max_ = s1.getGrade();
        double min_ = s1.getGrade();
        for (int i = 1; i < s.length; i++) {
            Student student = s[i];
            if (student != null) {
                sum += student.getGrade();
                if (student.getGrade() > max_) {
                    max_ = student.getGrade();
                }
                if (student.getGrade() < min_) {
                    min_ = student.getGrade();
                }
                count++;
            }
        }
        System.out.println("平均成绩:" + (sum - max_ - min_) / (count - 2));
    }
}

