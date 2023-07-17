package com.itheima.schoolwork.day3;

public class Demo1 {
    private class Inner extends Demo1{
        public Inner(){
            System.out.println("AAAA");
        }
    }
    public Demo1(){

        System.out.println("BBBB");
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1();
    }
}
