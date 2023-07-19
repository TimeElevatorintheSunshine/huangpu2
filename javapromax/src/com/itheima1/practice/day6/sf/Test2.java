package com.itheima1.practice.day6.sf;

public class Test2 {
    public static void main(String[] args) {
        // 二分查找
        int[] arr = {7, 23, 41, 56, 73, 78, 109, 159, 234};
        System.out.println(binarySearch(arr, 56));
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = (left + right) >> 1;
            if (target > arr[middle]) {
                left = middle + 1;
            } else if (target < arr[middle]) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
