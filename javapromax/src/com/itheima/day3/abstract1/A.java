package com.itheima.day3.abstract1;

public abstract class A {
    private String name;
    public A(){}
    /**
     * 抽象类中可以写抽象方法
     * 必须要用abstract修饰，没有方法体，只有方法签名
     */
    public abstract void run();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
