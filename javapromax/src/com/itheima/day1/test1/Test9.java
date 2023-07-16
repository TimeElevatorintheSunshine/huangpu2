package com.itheima.day1.test1;

/**
 * 定义一个方法，传递一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
 * 如果存在一个整数 x 使得n == 2的x次方，则认为 n 是 2 的幂次方。
 * 扩展：3的幂  4的幂
 * 比如：
 */
public class Test9 {
    public static void main(String[] args) {


       for (int i = 1 ; i <=100 ;i++) {
            int data = i;
            int count = 0;
            while (data >= 2 && data %2 ==0){
                count++;
                data /= 2;
            }
            if (data == 1){
                System.out.print(i +"是2的" + count +"次方" + "\t");
            }}

        }
    }



