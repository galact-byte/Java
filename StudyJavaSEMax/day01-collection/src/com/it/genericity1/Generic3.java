package com.it.genericity1;

public class Generic3 {
    public void main(String[] args) {
        StudentData sd=new StudentData();
        sd.add(new Student());
        sd.update(new Student());
        sd.delete(new Student());
        sd.query(1);

    }
}
