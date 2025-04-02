package com.it.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Shopping {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        String[] m={"Java入门","宁夏枸杞","黑枸杞","人字拖","特级枸杞","枸杞子"};
        for(String name:m){
            names.add(name);
        }
        System.out.println("当前存储商品:");
        System.out.println(names);
        Iterator<String> it=names.iterator();
        while(it.hasNext()){
            String element=it.next();
            if(element.contains("枸杞")){
                it.remove();
            }
        }
        System.out.println("批量删除枸杞后:");
        System.out.println(names);
    }
}
