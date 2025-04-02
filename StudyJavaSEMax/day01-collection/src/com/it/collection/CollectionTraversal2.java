package com.it.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionTraversal2 {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("张三丰");
        list.add("张翠山");
        list.add("宋青书");
        list.add("殷素素");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        list.forEach(s-> System.out.println(s));
    }
}

