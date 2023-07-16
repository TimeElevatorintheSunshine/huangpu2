package com.itheima.day2.static4;

public class A {
    // 定义一个静态的成员变量用于记住类的一个对象
     int aga;
    private static  A a = new A();
     static {
         a.aga = 22;
    }
    // 对类构造器私有化处理
    private A(){}
    // 定义一个静态方法，返回对象
   public static A getInstance(){
        return a;
   }

}
