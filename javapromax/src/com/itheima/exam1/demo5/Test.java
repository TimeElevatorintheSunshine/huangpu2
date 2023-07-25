package com.itheima.exam1.demo5;


import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> l = new MyArrayList<>();
        l.add("1");
        l.add(1,"2");

        MyArrayList<String> l1 = new MyArrayList<>();
        l1.add("1");
        l1.add("12");
        l1.add("13");
        System.out.println(l1);

        l.addAll(l1);
        System.out.println(l);
    }
}
