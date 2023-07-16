package com.itheima.day1.test4;

public class Car {
    private String name;
    private static int age;
    public void test1(){
        System.out.println("哈哈");
    }

    public static class Engine{
        public void test(){
            //System.out.println(name);
            System.out.println(age);
           // test1();
           // System.out.println(Car.this);
        }

    }
}
