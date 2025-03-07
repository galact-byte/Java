package com.it.loop;

//珠穆朗玛峰是8848.86米，假设有一张足够大的纸，厚度为0.1毫米，需要折多少次能达到它的高度
public class WhileDemo1 {
    public static void main(String[] args) {
        System.out.println("需要折叠" + piece() + "次");
    }

    public static int piece() {
        double peakHeight = 8848860;
        double paper = 0.1;
        int count = 0;
        while (paper < peakHeight) {
            paper = paper * 2;
            count++;
        }
        return count;
    }
}
