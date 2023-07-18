package com.itheima.schoolwork.day4;
/**
 * 利用循环,将-10.8到5.9之间的整数循环出来,
 * 然后利用Math类中的方法求出循环出来的数的绝对值然后比较是否大于6或者小于2.1
 */
public class Question9 {
    public static void main(String[] args) {
        int count = 0;
        for (double i = 5.9; i > -10.8 +1; i--) {
            double floor = Math.floor(i);
            System.out.println(floor);
           if (Math.abs(floor) > 6 || Math.abs(floor)<2){
               count++;
           }
        }
        System.out.println(count);
    }
}

