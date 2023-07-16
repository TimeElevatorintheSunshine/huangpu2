package com.itheima.day2.extends5;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
    }
}

class Cat extends Animal {
    // 方法重写，建议声明不变，重新实现
    @Override
    public void run() {
        System.out.println("猫跑");
    }
}

class Animal {
    public void run() {
        System.out.println("跑");
    }
}