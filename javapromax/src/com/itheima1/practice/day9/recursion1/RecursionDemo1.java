package com.itheima1.practice.day9.recursion1;

public class RecursionDemo1 {
    public static void main(String[] args) {
        // 递归的形式
       // test();
    }
        // 直接递归
//    public static void test(){
//        test();
//    }
        // 间接递归
    public static void test1(){
        test2();
    }
    public static void test2(){
        test1();
    }

}
