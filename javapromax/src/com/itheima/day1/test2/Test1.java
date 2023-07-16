package com.itheima.day1.test2;

/**
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 */
public class Test1 {
    public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7,8,9};
            int target = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    System.out.print(i + "和" + j + "\t");
                }
            }
        }
    }
}
