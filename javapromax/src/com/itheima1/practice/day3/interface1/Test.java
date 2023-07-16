package com.itheima1.practice.day3.interface1;

public class Test {
    public static void main(String[] args) {
        System.out.println(A.NAME);
    }
}
/**
 * 接口
 * JDK 1.8 之前的接口中只能是抽象方法和常量
 */
interface A{
    // 默认会加上 public static final 修饰
    String NAME = "黑马";
    // 抽象方法 默认加上 public abstract
    void run();
}