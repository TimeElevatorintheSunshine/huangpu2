package com.itheima.day2.extends6;

public class Test {
    public static void main(String[] args) {
        // 掌握子类访问成员的特点：就近原则
        Zi zi = new Zi();
        zi.showName();
    }
}
class Zi extends Fu{
    String name = "子";
    public void showName(){
        String name = "局部的";
        System.out.println(name); // 局部
        System.out.println(this.name); // 子类
        System.out.println(super.name); // 父类
        run();
        super.run();
    }

    @Override
    public void run() {
        System.out.println("子跑");
    }
}
class Fu{
    String name = "父";
    public void run(){
        System.out.println("父跑");
    }
}