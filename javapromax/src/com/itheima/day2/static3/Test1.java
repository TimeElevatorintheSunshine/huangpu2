package com.itheima.day2.static3;

public class Test1 {
    private String name;
    // 实例代码块，属于对象，每次创建对象都会执行一次。
    {
        System.out.println("======实例代码块执行一次===");
      //  name = "张三";
    }
    public Test1(){
        System.out.println("无参数构造器执行");
    }
    public static void main(String[] args) {
        // 实例代码块的特点和应用场景
        new Test1();
        new Test1();
        new Test1();
    }
}
