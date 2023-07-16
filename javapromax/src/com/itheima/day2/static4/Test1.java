package com.itheima.day2.static4;

public class Test1 {
    public static void main(String[] args) {
        // 懒汉单例
        B b1 = B.getInstance();
        B b2 = B.getInstance();
        System.out.println(b1.age);
        System.out.println(b2);
    }
}
