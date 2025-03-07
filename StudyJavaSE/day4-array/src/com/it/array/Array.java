package com.it.array;

public class Array {
    public static void main(String[] args) {
        random();
    }
    //随机点名程序，假设有15个学生
    public static void random(){
        String[] names = {"张三","李四","王五","赵六","钱七","孙八","周九","吴十","郑十一","王十二","冯十三","陈十四","褚十五","卫十六","蒋十七"};
        int index = (int)(Math.random()*names.length);
        for (int i = 0; i < names.length; i++) {
            if (i == index){
                System.out.println(names[i]);
            }
        }
    }

}
