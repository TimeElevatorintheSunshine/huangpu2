package com.itheima1.practice.day3.interface3;

import com.itheima.day2.extends2.Teacher;

public class Test {
    public static void main(String[] args) {
        // 接口的好处
        //弥补了类的单继承不足，一个类可以同时实现多个接口
        People p = new Student();
        Driver d = new Student();
        Cook c = new Student();
        //  让程序可以面向接口编程，这样程序员就可以灵活方便的切换各种业务实现。
        Driver d1 = new Teacher1();
    }
}

class Teacher1 implements Driver{}
class Student extends People implements Cook,Driver{

}
interface Cook{}
interface Driver{

}
class People{}