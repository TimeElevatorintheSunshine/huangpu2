package com.itheima.exam.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {

        ArrayList<Object> objects = new ArrayList<>(new ArrayList<>());

        MyArrayList objectMyArrayList = new MyArrayList<>();
      objectMyArrayList.add("11");
      objectMyArrayList.add("12");
      objectMyArrayList.add("13");
      objectMyArrayList.add("14");
        objectMyArrayList.remove("13");
        System.out.println(objectMyArrayList.index(6));
        System.out.println(objectMyArrayList);
        System.out.println(objectMyArrayList.size());
        objectMyArrayList.forEach(System.out::println);


    }
}
