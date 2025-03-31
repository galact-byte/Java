package com.it.genericity;

import java.util.ArrayList;

public class Generic1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("abc");
//        list.add(100);
//        list.add(true);
//        list.add(new Object());

        for (int i=0; i<list.size(); i++) {
            Object obj = list.get(i);
//            String rs=(String)obj;
            System.out.println(obj);
        }
    }
}
