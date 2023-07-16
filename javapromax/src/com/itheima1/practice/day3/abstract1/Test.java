package com.itheima1.practice.day3.abstract1;

public class Test {
    public static void main(String[] args) {
        // 创建对象
       //  A  a = new A(); //抽象类不能创建对象

        A a = new B();
        a.test();

    }
}
// 一个类继承抽象类，必须重写玩抽象类全部抽象方法，否则这个类也必须是抽象类

class B extends A{

    @Override
    public void test() {
        System.out.println("我是");
    }
}
/**
 * 抽象类中可以写抽象方法
 * 必须要用abstract修饰，没有方法体，只有方法签名
 */

abstract class A{
    private String name;
    public abstract void test();

    public A() {
    }

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}