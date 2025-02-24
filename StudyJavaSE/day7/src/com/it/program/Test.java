package com.it.program;

public class Test {
    public static void main(String[] args) {
        Student[] s= new Student[10];
        s[0]=new Student("张三","男",95);
        s[1]=new Student("李四","男",85);
        s[2]=new Student("王五","男",75);
        s[3]=new Student("赵六","男",65);
        s[4]=new Student("钱七","男",55);
        s[5]=new Student("孙八","男",45);
        s[6]=new Student("周九","男",35);
        s[7]=new Student("吴十","男",25);
        s[8]=new Student("郑十一","男",15);
        func info=new B(s);
//        func b=new B(s);
        info.printall();
        info.average();
    }
}
