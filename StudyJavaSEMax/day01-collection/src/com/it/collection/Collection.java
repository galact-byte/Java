package com.it.collection;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        // 1.List集合
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("java");
        list.add("c");
        list.add("c++");
        System.out.println(list);
        String rs = list.get(0);
        System.out.println(rs);

        // 2.Set集合
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("java");
        set.add("c");
        set.add("c++");
        System.out.println(set);
    }
}
