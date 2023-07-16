package com.itheima.day1.test4;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {11,22,33};
        arr(arr);
    }
    public static void arr(int[] arr){
        StringJoiner stringBuilder = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.add("" + arr[i]);
        }
        System.out.println(stringBuilder);
    }
}
