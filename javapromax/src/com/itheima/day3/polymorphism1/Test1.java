package com.itheima.day3.polymorphism1;



public class Test1 {
    public static void main(String[] args) {
        // 认识多态：对象多态，行为多态
        // 对象多态
        Animal a = new Dog();
        a.run();//多态下调用方法，编译看左边，运行看右边
        System.out.println(a.name); // 动物

        Animal a1 = new Wolf();
        a1.run();
        System.out.println(a.name); // 动物
    }
}

class Wolf extends Animal {
    String name = "狼";

    @Override
    public void run() {
        System.out.println("狼跑的快");
    }
}

class Dog extends Animal {
    String name = "狗";

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