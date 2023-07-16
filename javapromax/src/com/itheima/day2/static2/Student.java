package com.itheima.day2.static2;

public class Student {
    Double score;

    // 静态方法
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");

    }

    // 实例方法
    public void printPass() {
        System.out.println("成绩:" + (score >= 60 ? "及格" : "不及格"));
    }


}
