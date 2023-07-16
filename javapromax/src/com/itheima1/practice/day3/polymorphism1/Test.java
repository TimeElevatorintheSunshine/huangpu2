package com.itheima1.practice.day3.polymorphism1;

public class Test {
    public static void main(String[] args) {
        // 认识多态：对象多态，行为多态
        // 对象多态
        Animal d = new Dog();
        d.cry();// 编译看左边，运行看右边
        System.out.println(d.getName());

    }
}
class Cat extends Animal{
    private String name = "猫";
    @Override
    public void cry(){
        System.out.println("猫叫");
    }
}
class Dog extends Animal{
    private String name = "狗";
    @Override
    public void cry(){
        System.out.println("狗叫");
    }
}
class Animal {
    private String name = "动物";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void cry(){
        System.out.println("动物叫");
    }
}