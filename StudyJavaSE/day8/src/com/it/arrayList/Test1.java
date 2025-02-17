package com.it.arrayList;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //1. 添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("========================");
        //2. 删除元素
        list.remove("hello");
        System.out.println(list);
        System.out.println("========================");
        //3. 修改元素
        list.set(0,"javaee");
        System.out.println(list);
        System.out.println("========================");
        //4. 获取元素
        System.out.println(list.get(0));
    }
}
