package com.itheima.day1.test4;

import java.math.BigDecimal;

public class Test5 {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal("0.22");
        BigDecimal bd1 = new BigDecimal("0.3");
        Double d = 0.33;
        BigDecimal bd3 = BigDecimal.valueOf(d);
        bd = bd.add(bd1);
        bd = bd.divide(bd1,4,2);
        System.out.println(bd);
    }
}
