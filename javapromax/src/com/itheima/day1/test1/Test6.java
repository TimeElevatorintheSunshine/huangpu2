package com.itheima.day1.test1;

import java.util.Scanner;

/**
 * 需求：
 *	给你两个整数，被除数dividend和除数divisor。将两数相除，要求 不使用 乘法、除法和取余运算。
 * 	整数除法应该向零截断，也就是截去（truncate）其小数部分。
 *	例如，8.345 将被截断为 8 ，-2.7335 将被截断至 -2 。
 * 返回被除数dividend除以除数divisor得到的 商 。
 */

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int dividend = sc.nextInt();
            int divisor = sc.nextInt();
            int count = 0;
            if (divisor == 0){
                System.out.println("除数不能为0");
            }else {
           int data =  Math.abs(dividend);
            int data1 = Math.abs(divisor);
            while ( data >= data1){
                count++;
                data -= data1;
            }


           if (dividend < 0 && divisor > 0 || dividend > 0 && divisor<0){
               count = 0 -count;

           }
        System.out.println(count);}
        }


    }
}
