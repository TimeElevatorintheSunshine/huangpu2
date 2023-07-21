package com.itheima1.practice.day7.collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> l = new ArrayList<>();
        l.add("喜羊羊");
        l.add("懒羊羊");
        l.add("美羊羊");
        l.add("暖羊羊");
        System.out.println(l);
        // 迭代器
        Iterator<String> it = l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        // 增强for循环
        for (String s:l) {
            System.out.println(s);
        }

        // Lambda遍历集合
        l.forEach(System.out::println);



    }
}
