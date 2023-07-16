package com.itheima.day3.interface1;

/**
 * 接口
 * JDK 1.8 之前的接口中只能是抽象方法和常量
 */
public interface A {
    // 常量 默认会加上 public static final修饰的
    String NAME = "黑马";

    // 抽象方法：默认加上 public abstract
     void run();
}
