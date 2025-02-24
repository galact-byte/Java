package com.it.polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Sheep();
        System.out.println(((Sheep) a1).name);
        Animal a2=new Wolf();
        System.out.println(a2.name);
    }
}
