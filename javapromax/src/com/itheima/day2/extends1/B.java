package com.itheima.day2.extends1;
// 子类继承父类
public class B extends A{
    private int k;
    public void print3(){
        // 子类能继承父类的非私有成员
        System.out.println(i);
        print();
        getJ();
        // System.out.println(j);
        //  print1();
    }
}
