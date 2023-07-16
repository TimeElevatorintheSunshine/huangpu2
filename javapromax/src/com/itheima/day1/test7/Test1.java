package com.itheima.day1.test7;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[]arr = {44,23,6,12,64,13,73,99};
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = i +1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
