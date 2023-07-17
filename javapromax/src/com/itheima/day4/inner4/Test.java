package com.itheima.day4.inner4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 匿名内部类:匿名内部类本质就是一个子类，并会立即创建出一个子类对象。
        Animal animal = new Animal() {
            @Override
            public void run() {
                System.out.println("🐕🏃‍");
            }
        };

        animal.run();
    }
}
abstract class Animal{
    public abstract void run();
}