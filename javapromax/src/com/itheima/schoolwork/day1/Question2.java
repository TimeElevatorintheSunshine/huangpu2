package com.itheima.schoolwork.day1;

/**
 * 狗(Dog)
 *   成员变量: 姓名,颜色,价格
 *   成员方法: 吃饭,看家
 * 猫(Cat)
 *   成员变量: 姓名,颜色,价格
 *   成员方法: 吃饭,抓老鼠
 */
public class Question2 {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财","黄色",333.3);
        dog.eat();
        Cat cat = new Cat("波斯猫","蓝色",999.9);
        cat.eat();
    }
}
class  Dog extends Animal{
    @Override
    public void eat(){
        System.out.println(name + "在吃饭");
        lookHome();
    }
    public  void lookHome(){
        System.out.println(name +"看家");
    }
    public Dog() {
    }

    public Dog(String name, String color, Double price) {
        super(name, color, price);
    }
}

class  Cat extends Animal{
    @Override
    public void eat(){
        System.out.println(name + "在吃饭");
        catchMouse();
    }
    public  void catchMouse(){
        System.out.println(name +"抓老鼠");
    }
    public Cat() {
    }

    public Cat(String name, String color, Double price) {
        super(name, color, price);
    }
}
class Animal{
    public String name;
    public String color;
    public Double price;

    public Animal() {
    }

    public Animal(String name, String color, Double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void eat(){}
}