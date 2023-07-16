package com.itheima.day2.static4;

public class B {
    int age;
    // 定义一个静态变量用于记住类的一个唯一对象
    private static B b;

    // 构造器私有
    private B() {

    }

    // 定义一个静态方法返回类的一个对象
    public static B getInstance() {
        if (b == null) {
            b = new B();
        }
        return b;
    }
}
