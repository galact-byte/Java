package com.it.code;

public class Code {
    {
        System.out.println("构造代码块");
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        new Code();
    }
    static {
        System.out.println("静态代码块");
    }
}
