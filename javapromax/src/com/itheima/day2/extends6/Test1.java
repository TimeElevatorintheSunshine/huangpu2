package com.itheima.day2.extends6;

import com.itheima.day1.test4.A;

public class Test1 {
    public static void main(String[] args) {
        // 掌握子类构造器特点
        Dog dog = new Dog();

    }
}
class Dog extends Animal{
    public Dog(){
         // super(); 默认存在
        System.out.println("子类无参数构造器");

    }
}
class Animal{
    public Animal(){
        System.out.println("父类无参数构造器");
    }
    public Animal(String name){
        System.out.println("父类有参数构造器");
    }
}