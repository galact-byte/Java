package com.it.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversal {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("张三丰");
        list.add("张翠山");
        list.add("宋青书");
        list.add("殷素素");
        System.out.println(list);

        Iterator<String> it=list.iterator();
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
        while(it.hasNext()){
            String element=it.next();
            System.out.println(element);
        }
    }
}
