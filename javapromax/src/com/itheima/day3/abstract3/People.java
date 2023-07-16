package com.itheima.day3.abstract3;

public abstract class People {
    // 设计模板方法
    public final void write(){
        System.out.println("\t\t\t\t《我的老师》");
        System.out.println("\t我的老师好啊，每天喜欢吹牛皮，我很喜欢");
       write1();
        System.out.println("这就是我的老师，是不是很牛");
    }
    public abstract void write1();
}
