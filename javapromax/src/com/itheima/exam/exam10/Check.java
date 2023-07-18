package com.itheima.exam.exam10;

public class Check {
    public static void main(String[] args) {
         int[]  nums = {5,7,7,8,8,8,8,10};
         int target = 11;
        System.out.println("[" + check(nums, target) + ","+ check1(nums, target) +"]");

    }
    public static int check(int[] arr , int a){
       int left = 0;
       int right = arr.length-1;
       int Index = -1;
       while (left <= right){
           int midIndex = (left+right)>>1;
           if (arr[midIndex] > a){
               right = midIndex - 1;
           }else if(arr[midIndex] < a){
               left = midIndex + 1;

           }else {
               Index = midIndex;
               right = midIndex - 1;

           }
       }
        return Index;
}
    public static int check1(int[] arr , int a){
        int left = 0;
        int right = arr.length-1;
        int Index = -1;
        while (left <= right){
            int midIndex = (left+right)>>1;
            if (arr[midIndex] > a){
                right = midIndex - 1;
            }else if(arr[midIndex] < a){
                left = midIndex + 1;

            }else {
                Index = midIndex;
                left = midIndex +1;

            }
        }
        return Index;
    }
}
