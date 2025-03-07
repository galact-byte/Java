package com.it.lambda;

public class Test {
    public static void main(String[] args) {
        Animal a =  new Animal() {
            @Override
            public void cry() {
                System.out.println("cry");
            }
        };
        a.cry();
        Swim s=()-> System.out.println("swim");
        s.swim();
    }
}

abstract class Animal {
    public abstract void cry();
}

@FunctionalInterface
interface Swim {
    void swim();
}