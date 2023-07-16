package com.itheima.day3.abstract3;


public class Test1 {
    public static void main(String[] args) {
        People1 l = new Lecturer();
        l.setName("张三");
        l.setAge(22);
        l.introduce();
        People1 c = new Counsel();
        c.setName("李四");
        c.setAge(25);
        c.introduce();

    }
}

class Counsel extends People1{

    @Override
    public void introduce1() {
        System.out.println("回答问题的总人数有50个");
    }
}
class Lecturer extends People1{

    @Override
    public void introduce1() {
        System.out.println("我具备Java能力");
    }
}

abstract class People1{
    private String name;
    private int age;
    public abstract void introduce1();

    public void introduce(){
        System.out.println("======个人介绍======");
        System.out.println("我的名字叫" + getName());
        System.out.println("我的年龄" + getAge());
        introduce1();
        System.out.println("谢谢");
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