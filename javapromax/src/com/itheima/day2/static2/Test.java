package com.itheima.day2.static2;

public class Test {
    public static void main(String[] args) {
        // static修饰方法的使用
        // 类名.静态方法
     Student.printHelloWorld();

        // 对象.静态方法
        Student s1 = new Student();
        s1.printHelloWorld();

        // 对象.实例方法
        //  Student.printPass();
        s1.score = 90.0;
        s1.printPass();

    }

}
