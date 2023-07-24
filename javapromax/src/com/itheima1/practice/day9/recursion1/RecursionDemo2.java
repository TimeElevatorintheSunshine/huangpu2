package com.itheima1.practice.day9.recursion1;

public class RecursionDemo2 {
    public static void main(String[] args) {
        // 求1-n的阶乘
        System.out.println(f(5));

    }

    private static int f(int i) {
        if (i == 1) {
            return 1;
        }
        return f(i - 1) * i;
    }

}
