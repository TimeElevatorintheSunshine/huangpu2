package com.itheima.day1.test11.io1;

public class Test2 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally执行");
        }
    }
}
