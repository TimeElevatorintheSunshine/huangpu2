package com.itheima.exam.exam1;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        MyArrayList<Object> ob = new MyArrayList<>();
        ob.add(11);
        ob.add(12);
        ob.add(13);
        ob.add(14);
        System.out.println(ob.remove(1));
        ob.add(14);
        ob.add(14);
        System.out.println(ob);
    ob.foreach(System.out::println);

    }
}
