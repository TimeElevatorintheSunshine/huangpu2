package com.itheima.day7.List1;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        // list的特有方法
        List<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("java4");

        list.add(2,"黑马");
        System.out.println(list);

        list.remove("java1");

        list.set(0,"dlei");

        System.out.println(list.get(1));
        System.out.println(list);
    }
}
