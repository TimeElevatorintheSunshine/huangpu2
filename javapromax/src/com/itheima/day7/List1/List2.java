package com.itheima.day7.List1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("java4");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("~~~~~~~~~~~~~");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("~~~~~~~~~~~~~");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("~~~~~~~~~~~~~");
        list.forEach(System.out::println);



    }
}
