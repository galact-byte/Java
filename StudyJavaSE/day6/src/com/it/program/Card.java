package com.it.program;

// 加油站办卡
public class Card {
    private String number; //车牌号
    private String name; //车主姓名
    private int telenumber; //电话号码
    private double remain; //卡片余额

    public Card() {
    }

    public Card(String number, String name, int telenumber, double remain) {
        this.number = number;
        this.name = name;
        this.telenumber = telenumber;
        this.remain = remain;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelenumber() {
        return telenumber;
    }

    public void setTelenumber(int telenumber) {
        this.telenumber = telenumber;
    }

    public double getRemain() {
        return remain;
    }

    public void setRemain(double remain) {
        this.remain = remain;
    }

    public void show() {
        System.out.println("车牌号:" + number);
        System.out.println("车主姓名:" + name);
        System.out.println("电话号码:" + telenumber);
        System.out.println("卡片余额:" + remain);
    }
}
