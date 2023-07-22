package com.itheima.day8.set1;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        // 了解Set家族特点
        Set<String> set = new HashSet<>();
        set.add("java1");
        set.add("java2");
        set.add("java5");
        set.add("java6");
        set.add("java9");
        set.add("java3");
        set.add("java4");
        System.out.println(set);

        TreeSet<Double> set2 = new TreeSet<>();
        set2.add(93.3);
        set2.add(63.3);
        set2.add(13.3);
        set2.add(88.8);
        System.out.println(set2);
    }
}
