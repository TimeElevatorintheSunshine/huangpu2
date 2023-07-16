package com.itheima.day1.test1;

import java.util.Scanner;

/**
 * 需求：给你一个整数 x 。
 *            如果 x 是一个回文整数，打印 true ，否则，返回 false 。
 * 解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 例如，121 是回文，而 123 不是。
 * 比如：输入：x = 121		输出：true
 * 比如：输入：x = -121		输出：false
 * 					解释：从左向右读, 为 -121。从右向左读, 为 121- 。因此它不是一个回文数。
 * 比如：输入：x = 10		输出：false
 * 					解释：从右向左读, 为01。因此它不是一个回文数。
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        System.out.println(check1(data));



    }

    private static boolean check1(int data) {
        int temp = data;
        if (data<0)return false;
       int reverse = 0;
       while (data != 0){
           int last = data %10;
           data = data /10;
           reverse = reverse * 10 + last;
       }
       return reverse == temp;
    }

    public static  boolean check (String s){
        for (int i = 0, j = s.length() -1; j > i; i++,j--) {
                if (!(s.charAt(i) == s.charAt(j))){
                   return false;
            }
        }
        return true;
    }
}
