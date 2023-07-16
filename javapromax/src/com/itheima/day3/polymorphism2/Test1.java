package com.itheima.day3.polymorphism2;

import com.sun.org.apache.xml.internal.dtm.ref.DTMNamedNodeMap;

public class Test1 {
    public static void main(String[] args) {
        // 认识多态的好处
        // 好处，多态下右边对象是解耦合的，更利于扩展和维护
        Animal a = new Wolf();
        a.run();
        go(a);
       // a.test() //报错
        // 强制类型转换可以实现多态下调用子类的独有功能
        System.out.println(a);
        Wolf l = (Wolf) a;
        System.out.println(l);
        // 有继承关系的两个类型的变量编译阶段就可以强制类型转换，编译阶段一定不报错
        // 但是运行阶段可能出现强制类型转换异常
       // ((Dog)a).test(); 报错
        if (a instanceof Wolf){
            Wolf l1= (Wolf) a;
            l1.test();
        }else if (a instanceof Dog){
            Dog a1 = (Dog)a;
            a1.test();
        }
        Dog dog = new Dog();
        Animal aa = (Animal) dog;
        System.out.println(dog);
        System.out.println(aa);
        go(dog);
       /* byte y = (byte) 12312;
        System.out.println(y);
        Animal animal = new Animal();
        Dog dog1 = (Dog) animal;
        dog1.test();*/

    }

    //让父类类型的变量作为方法的参数，这样可以接受一切子类对象
    public static void go(Animal a) {
        System.out.println("开始");
        a.run();
        if (a instanceof Wolf){
            Wolf l1= (Wolf) a;
            l1.test();
        }else if (a instanceof Dog){
            Dog a1 = (Dog)a;
            a1.test();
        }
        System.out.println("结束");
    }
}

class Wolf extends Animal {
    String name = "狼";
    public void test(){
        System.out.println("灰太狼");
    }
    @Override
    public void run() {
        System.out.println("狼跑的快");
    }
}

class Dog extends Animal {
    String name = "狗";
    public void test(){
        System.out.println("二狗子");
    }
    @Override
    public void run() {
        System.out.println("狗跑的比较快");
    }
}

class Animal {
    String name = "动物";

    public void run() {
        System.out.println("动物会跑");
    }
}