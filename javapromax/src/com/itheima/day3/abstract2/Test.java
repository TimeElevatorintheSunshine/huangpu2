package com.itheima.day3.abstract2;



public class Test {
    public static void main(String[] args) {
        // 认识抽象类的好处和场景
        Animal c = new Cat("猫");
        c.cry();
        Animal d = new Dog();
        d.setName("狗");
        d.cry();

    }
}

class Cat extends Animal{
    public Cat(String name) {
        setName(name);
    }

    public Cat() {
    }

    @Override
    public void cry() {
        System.out.println(getName() + "喵喵叫");
    }
}
class Dog extends Animal{

    @Override
    public void cry() {
        System.out.println(getName() + "汪汪叫");
    }
}
abstract class Animal {
    private String name;
public abstract void cry();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}