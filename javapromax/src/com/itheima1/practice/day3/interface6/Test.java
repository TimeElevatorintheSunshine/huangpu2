package com.itheima1.practice.day3.interface6;

public class Test {
    public static void main(String[] args) {
        // JDK 8开始新增的三种方法
        A a = new B();
        a.test();
        A.test3();
    }
}
class B implements A {

}
interface A{
    // 支持写默认方法
    // 默认会加public ，但是必须加default
    // 必须用接口实现类对象调用
    default void test(){
        System.out.println("测试");
       // test1();
    }

    // 私有方法(JDK 9 开始支持)
    // 给其他默认方法或者私有方法调用
     /*   private void test1(){
            System.out.println("测试2");
        }*/

    //静态方法
    //只能用接口名调用
    static void test3(){
        System.out.println("测试3");
    }

}