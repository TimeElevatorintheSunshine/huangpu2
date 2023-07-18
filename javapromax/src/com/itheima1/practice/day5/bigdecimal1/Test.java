package com.itheima1.practice.day5.bigdecimal1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        // 目标：掌握BigDecimal进行精确运算的方案。
        double a = 0.1;
        double b = 0.2;

        BigDecimal c = BigDecimal.valueOf(a);
        BigDecimal d = BigDecimal.valueOf(b);

        BigDecimal add = c.add(d);
        System.out.println(add); //加

        BigDecimal subtract = c.subtract(d);
        System.out.println(subtract); // 减

        BigDecimal multiply = c.multiply(d);
        System.out.println(multiply); // 乘

        BigDecimal divide = c.divide(d);
        System.out.println(divide); // 除

        BigDecimal e = BigDecimal.valueOf(0.3);
        BigDecimal divide1 = c.divide(e, 2, RoundingMode.HALF_UP);
        System.out.println(divide1);

        double v = c.doubleValue(); // 转换小数
        System.out.println(v);
    }
}
