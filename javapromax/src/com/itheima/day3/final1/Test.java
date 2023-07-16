package com.itheima.day3.final1;

public class Test {
    //使用了 static final 修饰的成员变量就被称为常量
    //常量名的命名规范：建议使用大写英文单词，多个单词使用下划线连接起来。
    public static final String SCHOOL_NAME = "黑马程序员";

    private final String name = "张三";
    public static void main(String[] args) {
        // final的作用
        //final 修饰变量，总规则：该变量有且仅能被赋值一次

       final int data =66;
      // data = 123;  //第二次赋值报错

        buy(0.8);
    }
    public static void buy(final double a){
        // a = 0.1; //第二次赋值报错
    }
}

// final 修饰类，类不能被继承
final class A{}

// class B extends A{}

//final修饰方法，方法不能被重写
class C{
    public final void test(){}
}
class D extends C{
    /*@Override
    public final void test(){}*/
}