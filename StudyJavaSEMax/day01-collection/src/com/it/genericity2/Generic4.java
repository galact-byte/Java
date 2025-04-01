package com.it.genericity2;


import com.it.genericity1.Student;

public class Generic4 {
    public static void main(String[] args) {
        String[] names= {"zhangsan","lisi","wangwu"};
        printArray(names);

        Student[] students= new Student[10];
        printArray(students);

        String max=getMAx(names);
        Student max1=getMAx(students);
    }

    private static <T> void printArray(T[] names) {
    }

    private static <T> T getMAx(T[] names){
        return null;
    }
}
