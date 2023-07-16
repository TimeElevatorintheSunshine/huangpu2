package com.itheima.day1.test6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        String[] str = {"abf","bas","Agf","zfg","Cas","Bsf"};
        Arrays.sort(str, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(str));

        /*Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });*/
    }
}
