package com.itheima1.practice.day6.arrays1;

import java.util.Arrays;
import java.util.function.IntFunction;

public class ArraysDemo1 {
    public static void main(String[] args) {
        // 返回数组内容
        Integer[] arr = {11,22,33,44,55,66};

        System.out.println(Arrays.toString(arr));
        // 拷贝数组，并返回新数组
        Integer[] integers1 = Arrays.copyOfRange(arr, 2, 5);
        System.out.println(Arrays.toString(integers1));
        // 给数组扩容
        Integer[] integers = Arrays.copyOf(arr, arr.length + 1);
        System.out.println(Arrays.toString(integers));
        // 修改数组每个数据，再存入
//        Arrays.setAll(arr, new IntFunction<Integer>() {
//            @Override
//            public Integer apply(int value) {
//                return arr[value] *2;
//            }
//        });
        Arrays.setAll(arr, value-> arr[value] *2);

        // 数组排序
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));



    }
}
