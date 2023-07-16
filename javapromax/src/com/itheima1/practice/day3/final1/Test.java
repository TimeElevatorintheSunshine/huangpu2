package com.itheima1.practice.day3.final1;

public class Test {
    //使用了 static final 修饰的成员变量就被称为常量
    //常量名的命名规范：建议使用大写英文单词，多个单词使用下划线连接起来。
    private static final String SCHOOL_NAME = "黑马程序员";
    public static void main(String[] args) {
        // final的作用
        //final 修饰变量，总规则：该变量有且仅能被赋值一次
        final int a = 10;
       //  a = 20;  // 报错不能第二次赋值
        buy(0.12);
    }
    public static void buy( final double c){
      //  c = 0.9; //报错 不能第二次赋值
    }
}
// final 修饰类，类不能被继承

final class A{}
 // class B extends A{} //报错

//final修饰方法，方法不能被重写

class C{
    public final void run(){

    }
}
class D extends C{
   /* @Override
    public final void run(){

    }*/ //报错
}