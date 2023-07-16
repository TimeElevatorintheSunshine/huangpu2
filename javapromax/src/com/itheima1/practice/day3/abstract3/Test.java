package com.itheima1.practice.day3.abstract3;

public class Test {
    public static void main(String[] args) {
        // 模板设计模式
        People p = new Teacher();
        p.writeTemplate();
        People p1 = new Student();
        p1.writeTemplate();

    }
}

class Teacher extends People{

    @Override
    public void write() {
        System.out.println("Java之父是我的老师");
    }
}
class Student extends People{

    @Override
    public void write() {
        System.out.println("我的老师写Java无敌，逼着眼睛写，代码自动填充");
    }
}
abstract class People{
    public abstract void write();
    public void writeTemplate(){
        System.out.println("\t\t\t\t《我的老师》");
        System.out.println("\t我的老师很强大，每天吹水，他被誉为吹水王");
        write();
        System.out.println("\t这就是我的老师");
    };

}