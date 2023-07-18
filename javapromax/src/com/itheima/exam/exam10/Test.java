package com.itheima.exam.exam10;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> s = new MyArrayList<>();
        s.add("java");
        s.add("java1");
        s.add("java2");
        s.add("java3");
        s.forEach(System.out::println);
        System.out.println(s.size());
        System.out.println(s.get(1));
        System.out.println(s.remove(1));
        s.forEach(System.out::println);
    }
}
