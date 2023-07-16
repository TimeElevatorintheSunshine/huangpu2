package com.itheima.day3.interface3;

public class Test {
    public static void main(String[] args) {
        // 接口的好处
        //弥补了类的单继承不足，一个类可以同时实现多个接口
        People  p = new Student();
        Doctor d = new Student();
        Driver d1 = new Student();
        //  让程序可以面向接口编程，这样程序员就可以灵活方便的切换各种业务实现。
        Doctor d2 = new Teacher();
    }
}
class Student extends People implements Driver,Doctor{

}
class Teacher implements Doctor{}
class People{

        }
interface Driver{

}
interface Doctor{}