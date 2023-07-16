package com.itheima1.practice.day3.abstract2;

public class Test {
    public static void main(String[] args) {
        // 认识抽象类的好处和场景
        Animal a = new Dog();
        a.setName("狗");
        a.cry();
        Animal b = new Cat();
        b.setName("猫");
        b.cry();
    }
}


class Cat extends Animal{

    @Override
    public void cry() {
        System.out.println(getName() + "叫");
    }
}

class Dog extends Animal{
    @Override
    public void cry() {
        System.out.println( getName() + "叫");
    }
}
abstract class Animal{
    private String name;
    public abstract void cry();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}