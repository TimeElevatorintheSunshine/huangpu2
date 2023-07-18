package com.itheima.schoolwork.day4;

import java.math.BigDecimal;

/**
 * 日常开发中，浮点数参数运算场景不少，但是java中浮点数在运算时往往不够精确
 * ，所以需要别的方式来解决，请并且给出精确输出(得到结果为0.2)的代码！
 */
public class Question2 {
    public static void main(String[] args) {
        double a= 0.01;
        double b= 0.05;

        BigDecimal bigDecimal = BigDecimal.valueOf(a);
        BigDecimal bigDecimal1 = BigDecimal.valueOf(b);

        System.out.println(bigDecimal.divide(bigDecimal1));
    }
}
