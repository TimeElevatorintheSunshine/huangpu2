package com.itheima1.practice.day3.abstract3;

public class Test1 {
    public static void main(String[] args) {
        People1  p = new Lecturer();
        p.setName("张三");
        p.setAge(22);
        p.introduce();
        People1  p1 = new Counsel();
        p1.setName("李四");
        p1.setAge(27);
        p1.introduce();
    }
}
class Lecturer extends People1{

    @Override
    public void skill() {
        System.out.println("我会Java");
    }
}
class Counsel extends People1{

    @Override
    public void skill() {
        System.out.println("我点名50个人");
    }
}
abstract class People1{
    private String name;
    private int age;
    public abstract void skill();
    public void introduce(){
        System.out.println("====个人介绍====");
        System.out.println(getName());
        System.out.println(getAge());
        skill();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}