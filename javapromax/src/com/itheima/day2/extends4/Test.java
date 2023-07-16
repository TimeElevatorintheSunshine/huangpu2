package com.itheima.day2.extends4;

public class Test {
    public static void main(String[] args) {
        // 掌握继承特点，单继承
       A a = new A();
       a.toString();
       a.hashCode();
    }
}
 // class C extends B,A{} 报错
class C extends B{}
class B extends A{}
class A{}