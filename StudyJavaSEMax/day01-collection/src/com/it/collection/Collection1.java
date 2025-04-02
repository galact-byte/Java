package com.it.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.IntFunction;

public class Collection1 {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println(list);

        // 输出集合的大小
        System.out.println(list.size());

        list.remove("hello");
        System.out.println(list);

        System.out.println(list.isEmpty());

        // list.clear();
        // System.out.println(list);

        System.out.println(list.contains("java"));

        Object[] arr= list.toArray();
        System.out.println(Arrays.toString(arr));

        // 把集合转换成字符串数组
        // String[] arr0=list.toArray(new String[0]);
        String[] arr1=list.toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                // 返回一个长度为0的String数组
                return new String[0];
            }
        });
    }
}
