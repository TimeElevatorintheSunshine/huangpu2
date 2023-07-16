package com.itheima.day1.test7;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[]arr = {44,23,6,6,64,13,73,99};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(index(arr, 6));
    }
    public static int index (int[] arr,int a){
        int left = 0;
        int right = arr.length -1;
        while (left <= right){
            int midIndex = (left +right ) >> 1;
            if (a > arr[midIndex]){
                left = midIndex + 1;
            }else if (a < arr[midIndex]){
                right = midIndex -1;
            }
            else {
                return midIndex;
            }

        }return -1;
    }
}
