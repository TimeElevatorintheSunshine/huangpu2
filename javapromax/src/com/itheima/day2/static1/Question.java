package com.itheima.day2.static1;

public class Question {
    public static void main(String[] args) {
        //目标：静态变量应用场景
        new User();
        new User();
        new User();
        new User();

        System.out.println(User.number);
    }
}
