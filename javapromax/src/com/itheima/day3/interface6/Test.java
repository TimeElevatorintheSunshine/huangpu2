package com.itheima.day3.interface6;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        // JDK 8开始新增的三种方法
        A a = new B();
        a.run();
        A.cry();

    }
}

class B implements A{

}
interface A{
    // 支持写默认方法
    // 默认会加public ，但是必须加default
    // 必须用接口实现类对象调用
     default void run(){
         System.out.println("开始跑");
        // go();
    }

    // 私有方法(JDK 9 开始支持)
    //给其他默认方法或者私有方法调用
    /*private void go(){
        System.out.println("准备go");
    }*/

    //静态方法
    //只能用接口名调用
    static void cry(){
        System.out.println("我开始慌了");
    }
}

