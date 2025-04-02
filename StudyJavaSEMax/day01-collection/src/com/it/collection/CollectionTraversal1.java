package com.it.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversal1 {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("张三丰");
        list.add("张翠山");
        list.add("宋青书");
        list.add("殷素素");

        for(String name:list){
            System.out.println(name);
        }

        String[] users={"张无忌","张三丰","张翠山","宋青书","殷素素"};
        for(String name:users){
            System.out.println(name);
        }
    }
}

