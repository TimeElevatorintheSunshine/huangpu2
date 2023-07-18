package com.itheima.schoolwork.day4;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 已知手机的价格是3999, 钢化膜的价格是9.9, 店家促销策略为: 满4000打98折.
 * 现在小明买了一台手机和两块钢化膜, 请问小明应该付多少钱(精确到分)？
 */
public class Question1 {
    public static void main(String[] args) {
        BigDecimal b = BigDecimal.valueOf(3999);
        BigDecimal b1 = BigDecimal.valueOf(9.9);
        BigDecimal b2 = BigDecimal.valueOf(0.98);
        BigDecimal b3 = BigDecimal.valueOf(1);
        BigDecimal add = b.add(b1).add(b1);
        System.out.println(add);
        if (add.doubleValue() >=4000){
            BigDecimal multiply = add.multiply(b2);
            multiply =  multiply.divide(b3,2,RoundingMode.HALF_UP);
            System.out.println(multiply);
        }

    }
}
