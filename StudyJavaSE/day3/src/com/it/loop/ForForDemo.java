package com.it.loop;

public class ForForDemo {
    public static void main(String[] args) {
        loop();
    }

    public static void loop() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
