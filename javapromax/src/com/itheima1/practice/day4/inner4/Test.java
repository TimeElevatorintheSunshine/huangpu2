package com.itheima1.practice.day4.inner4;

public class Test {
    public static void main(String[] args) {
        // 匿名内部类:匿名内部类本质就是一个子类，并会立即创建出一个子类对象。
        Animal a = new Animal(){
            @Override
            public void run() {
                System.out.println("狗跑的贼快");
            }
        };
        a.run();
    }
}

abstract class Animal{
    public abstract void run();
}