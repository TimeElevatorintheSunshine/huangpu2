package com.itheima.day1.test7;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {44,23,6,12,64,13,73,99};
        for (int i = 0; i < arr.length -1; i++) {
            for (int j =0; j < arr.length -i -1; j++) {

                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j +1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
