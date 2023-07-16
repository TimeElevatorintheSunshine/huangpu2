package com.itheima.day3.abstract1;
// 一个类继承抽象类，必须重写玩抽象类全部抽象方法，否则这个类也必须是抽象类
public class B extends A{
    @Override
    public void run() {
        System.out.println("跑");
    }
}
