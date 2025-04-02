package com.it.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionTraversal3 {
    public static void main(String[] args) {
        // 1.并发修改异常问题
        ArrayList<String> list=new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        list.add("西洋参");
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            String name=list.get(i);
            if(name.contains("枸杞")){
                list.remove(name);
            }
        }
        System.out.println(list);
        System.out.println("==========================");

        // 解决方案1 i--(前提是支持索引)
        ArrayList<String> list1=new ArrayList<>();
        list1.add("Java入门");
        list1.add("宁夏枸杞");
        list1.add("黑枸杞");
        list1.add("人字拖");
        list1.add("特级枸杞");
        list1.add("枸杞子");
        list1.add("西洋参");

        for(int i=0;i<list1.size();i++){
            String name=list1.get(i);
            if(name.contains("枸杞")){
                list1.remove(name);
                i--;
            }
        }
        System.out.println(list1);
        System.out.println("==========================");

        // 解决方案2 倒序遍历(前提是支持索引)
        ArrayList<String> list2=new ArrayList<>();
        list2.add("Java入门");
        list2.add("宁夏枸杞");
        list2.add("黑枸杞");
        list2.add("人字拖");
        list2.add("特级枸杞");
        list2.add("枸杞子");
        list2.add("西洋参");

        for(int i=list2.size()-1;i>=0;i--){
            String name=list2.get(i);
            if(name.contains("枸杞")){
                list2.remove(name);
            }
        }
        System.out.println(list2);
        System.out.println("==========================");
        
        // 解决方案3 迭代器遍历
        ArrayList<String> list3=new ArrayList<>();
        list3.add("Java入门");
        list3.add("宁夏枸杞");
        list3.add("黑枸杞");
        list3.add("人字拖");
        list3.add("特级枸杞");
        list3.add("枸杞子");
        list3.add("西洋参");

        Iterator<String> it=list3.iterator();
        while(it.hasNext()){
            String name=it.next();
            if(name.contains("枸杞")){
                it.remove();
            }
        }
        System.out.println(list3);
        System.out.println("==========================");

        // 增强for循环和foreach循环
        ArrayList<String> list4=new ArrayList<>();
        list4.add("Java入门");
        list4.add("宁夏枸杞");
        list4.add("黑枸杞");
        list4.add("人字拖");
        list4.add("特级枸杞");
        list4.add("枸杞子");
        list4.add("西洋参");

        // for(String name:list4){
        //     if(name.contains("枸杞")){
        //         list4.remove(name);
        //     }
        // }
        // list4.forEach(new Consumer<String>() {
        //     @Override
        //     public void accept(String s) {
        //         if(s.contains("枸杞")){
        //             list4.remove(s);
        //         }
        //     }
        // });
        System.out.println(list4);
    }
}

