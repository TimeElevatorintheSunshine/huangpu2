package com.itheima.exam.exam6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Integer[] arr = {5, 7, 7,7 ,8, 8, 9,10};    //O(1)
        int target = 7;  //O(1)
        ArrayList<Integer> integers = new ArrayList<>();  //O(1)
        integers.add(search(arr,target));
       // integers.add(Arrays.binarySearch(arr,target));   // O(log()n)
        integers.add(search1(arr,target));   //O(N)
        System.out.println(integers);  //O(1)


    }
    public static int search1(Integer[] arr, int target){
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i] ==target){
               return i;
            }
        }return -1;
    }

    public static int search(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else{
                return mid;
            }
        }
        return -1;
    }

}
