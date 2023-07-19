package com.itheima.day6.arrays1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntUnaryOperator;

public class ArraysDemo1 {
    public static void main(String[] args) {
        // 返回数组内容
        Integer[] arr = {11,22,33,44,55,66};
        System.out.println(Arrays.toString(arr));

        // 拷贝数组，并返回新数组
        Integer[] ints = Arrays.copyOfRange(arr, 2, 5);
        System.out.println(Arrays.toString(ints));

        // 给数组扩容
        Integer[] arr1 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr1));

        // 修改数组每个数据，再存入
        Arrays.setAll(arr, index -> arr[index] * 2 );


        System.out.println(Arrays.toString(arr));

        // 数组排序
        Arrays.sort(arr, (o1,o2) -> o2-o1);


        System.out.println(Arrays.toString(arr));
    }
}
