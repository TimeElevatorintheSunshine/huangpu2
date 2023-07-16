package com.itheima.day1.test2;

import java.util.Arrays;

/**
 * 给定两个正序数组arr1和arr2，请先合并数组，并找出合并之后数组的中位数。
 * 	1 2 3 4 5 6 7 8 9    中位数：5
 * 	1 2 3 4 5 6     		中位数：（ 3 + 4 ） / 2
 */
public class Test3 {
    public static void main(String[] args) {
        int[] arr1 = {2,4,5,6,7};
        int[] arr2 = {3,4,5,9,7,10,3};
        int[] arr3 = Arrays.copyOf(arr1, arr2.length + arr1.length);
        int count = 0;
        for (int i =  arr3.length  -1 ; i >= arr1.length; i--) {
                arr3[i] = arr2[count++];
        }
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        if (arr3.length % 2 ==0){
            System.out.println((arr3[arr3.length / 2] + arr3[arr3.length / 2 - 1]) /2);
        }else {
            System.out.println(arr3[arr3.length / 2]);
        }

    }
}
