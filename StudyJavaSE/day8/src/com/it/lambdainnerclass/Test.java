package com.it.lambdainnerclass;

public class Test {
    public static void main(String[] args) {
        Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("student is swimming");
            }
        };
        Swim s2 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("Teacher is swimming");
            }
        };
        Swim s3 = new Stduent();
        Swim s4 = new Teacher();
        s1.swimming();
        System.out.println("-------------------------");
        s2.swimming();
        System.out.println("-------------------------");
        start(s3);
        start(s4);
    }

    public static void start(Swim s) {
        s.swimming();
    }
}

class Stduent implements Swim {
    @Override
    public void swimming() {
        System.out.println("student is swimming");
    }
}

class Teacher implements Swim {
    @Override
    public void swimming() {
        System.out.println("Teacher is swimming");
    }
}