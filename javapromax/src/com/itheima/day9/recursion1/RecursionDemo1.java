package com.itheima.day9.recursion1;

public class RecursionDemo1 {
    public static void main(String[] args) {
        // 递归的形式
       // test();
    }
//    public static void test(){
//        System.out.println("========test=======");
//        test();// 直接递归
//    }

    // 间接递归
    public static void test2(){
        System.out.println("========test=======");
        test3();
    }
    public static void test3(){
        System.out.println("========test=======");
        test2();
    }
}
