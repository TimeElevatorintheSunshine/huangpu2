package com.itheima.day6.sf;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1, 5, 7, 3, 6, 9};
        // 冒泡排序
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }

        // 选择排序
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        // 选择排序(优化)
        for (int i = 0; i < arr.length -1; i++) {
            int min = i; //交换索引
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]){
                   min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));


    }
}
