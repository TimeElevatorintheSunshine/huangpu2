package com.itheima1.practice.day6.method1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 特定类型的方法引用
        String[] names = {"Bei","das","aef","cwd","徐磊","ASA","Cas","ASF"};
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));


    }
}
