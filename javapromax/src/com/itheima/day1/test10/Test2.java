package com.itheima.day1.test10;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(f(6)); // 1-n 的阶乘
        System.out.println(f1(10)); // 1-n 的和
    }
    public static int f(int a){
        if (a == 1){
            return 1;
        }
       return a*f(--a);
    }
    public static int f1(int a){
        if (a == 1){
            return 1;
        }
        return a + f1(--a);
    }
}
