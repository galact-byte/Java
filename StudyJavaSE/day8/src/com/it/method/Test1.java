package com.it.method;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        //输入几个英文名字
        String[] s= {"Tom","alen","Jerry","jackie","Jack","Mary"};
//        Arrays.sort(s, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });
//        Arrays.sort(s,(o1,o2)->o1.compareToIgnoreCase(o2));
        Arrays.sort(s,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(s));
    }
}
