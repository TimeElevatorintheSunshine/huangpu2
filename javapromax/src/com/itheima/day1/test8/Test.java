package com.itheima.day1.test8;

public class Test {
    public static void main(String[] args) {
        String s = "13342352351";
        System.out.println(s.matches("[1][3-9]\\d{9}"));
        String s1 = "123asd@asd.cn.com";
        System.out.println(s1.matches("\\w{2,9}@\\w{3,9}(\\.\\w{2,10}){1,2}"));
        String s2 = "00:00:00";
        System.out.println(s2.matches("([0-1][0-9]|[2][0-3]):[0-5][0-9]:[0-5][0-9]"));
    }
}
