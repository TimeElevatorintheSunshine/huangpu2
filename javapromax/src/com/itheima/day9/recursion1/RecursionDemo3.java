package com.itheima.day9.recursion1;

public class RecursionDemo3 {
    public static void main(String[] args) {
        // 猴子吃桃
        // 公式： f(x+1) = f(x) - f(x)/2 - 1;
        // 终结点: f(10) = 1
        System.out.println(f(1));

    }
    public static int f(int x){
        if (x==10){
            return 1;
        }
        return 2*f(x+1)+2;

    }
}
