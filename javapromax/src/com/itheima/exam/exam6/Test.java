package com.itheima.exam.exam6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Integer[] arr = {5, 7, 7,7 ,8, 8, 9,10};    //O(1)
        int target = 7;  //O(1)
        //O(1)
        System.out.println("[" +search1(arr, target)+","+search(arr, target)+"]");
        // integers.add(Arrays.binarySearch(arr,target));   // O(log()n)

        //O(1)


    }
    public static int search1(Integer[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int count = -1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else{
                count = mid;
                right =mid-1;
            }
        }
        return count;
    }

    public static int search(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int count = -1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else{
                 count = mid;
                 left =mid+1;
            }
        }
        return count;
    }

}
