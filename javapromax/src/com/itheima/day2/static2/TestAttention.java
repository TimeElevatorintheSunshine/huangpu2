package com.itheima.day2.static2;

public class TestAttention {
    public static String schoolName="黑马";
    private String name;
    public static void test(){}
     public void run(){}

    public static void main(String[] args) {

    }
    public void print1(){
        System.out.println(schoolName);
        test();
        run();
        System.out.println(name);
        System.out.println(this);
    }
    public static void print(){
        System.out.println(schoolName);
        test();
     //   System.out.println(name); // 报错
        // run(); // 报错
      //  System.out.println(this); //报错
    }
}
