package com.itheima.day6.method1;

import java.util.*;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 特定类型的方法引用
        String[] names = {"Bei","das","aef","cwd","徐磊","ASA","Cas","ASF"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.forEach(System.out::println);
    }
}
