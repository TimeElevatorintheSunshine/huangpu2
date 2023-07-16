package com.itheima.day2.static1;

public class Test {
    public static void main(String[] args) {
        Student.name = "猪猪侠";
        Student s1 = new Student();
        s1.name = "小菲菲";

        Student s2 = new Student();
        s2.name = "超人强";

        System.out.println(s1.name); //超人强
        System.out.println(Student.name); //超人强

        s1.age = 22;
        s2.age = 55;
        System.out.println(s1.age); //22
       // System.out.println(Student.age); //报错

    }
}
