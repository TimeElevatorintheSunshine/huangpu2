package com.itheima.day2.extends2;

public class Test {
    public static void main(String[] args) {
        // 掌握使用继承的好处，提高代码的复用性
        Teacher t = new Teacher();

        t.setName("黑马");
        t.setSkill("Java");
        System.out.println(t.getSkill());
        System.out.println(t.getName());
    }
}
