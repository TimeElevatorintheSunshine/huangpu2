package com.itheima1.practice.day3.polymorphism2;

public class Test {
    public static void main(String[] args) {
        // 认识多态的好处
        // 好处，多态下右边对象是解耦合的，更利于扩展和维护
        Animal d = new Dog();
        d.cry();
        // d.lookHome(); // 报错
        // 强制类型转换可以实现多态下调用子类的独有功能
        Dog d1 = (Dog) d;
        d.cry();
        d1.lookHome();

        // 有继承关系的两个类型的变量编译阶段就可以强制类型转换，编译阶段一定不报错
        // 但是运行阶段可能出现强制类型转换异常
       // Cat c1 = (Cat) d; //编写不报错，运行报错
        if (d instanceof Dog){
            Dog d2 = (Dog) d;
            d2.lookHome();
        }else if (d instanceof Cat){
            Cat c2 = (Cat) d;
            c2.catchMouse();
        }
        go(d);
    }
    //让父类类型的变量作为方法的参数，这样可以接受一切子类对象
    public static void go(Animal a){
        System.out.println("开始");
        a.cry();
        if (a instanceof Dog){
            Dog d2 = (Dog) a;
            d2.lookHome();
        }else if (a instanceof Cat){
            Cat c2 = (Cat) a;
            c2.catchMouse();
        }
        System.out.println("结束");
    }
}
class Cat extends Animal {
    private String name = "猫";
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
    @Override
    public void cry(){
        System.out.println("猫叫");
    }
}
class Dog extends Animal {
    private String name = "狗";
    public void lookHome(){
        System.out.println("看家");
    }
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