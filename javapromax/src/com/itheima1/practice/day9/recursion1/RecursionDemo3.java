package com.itheima1.practice.day9.recursion1;

public class RecursionDemo3 {
    public static void main(String[] args) {
        // 猴子吃桃
        // 公式： f(x+1) = f(x) - f(x)/2 - 1;
        // 优化： f(x) = 2 * f( x + 1) + 2;
        // 终结点: f(10) = 1
        System.out.println(f(1));

    }

    private static int f(int i) {
        if (i == 10) {
            return 1;
        }
        return 2 * f(i + 1) + 2;

    }

}
