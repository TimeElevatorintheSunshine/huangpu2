package com.itheima.day3.interface2;

public class Test {
    public static void main(String[] args) {
        // 掌握接口的基本使用，被类实现的

    }
}
//实现类可以同时实现多个接口，接口是被类实现的
//一个类实现多个接口，必须重写玩全部接口的全部抽象方法，否则实现类需要定义成抽象类
class PingPongMan implements Law,SportMan{
    private String name;
    @Override
    public void rule() {

    }

    @Override
    public void run() {

    }

    @Override
    public void competition() {

    }
}
interface Law{
    void rule();
}
interface SportMan{
    void run();
    void competition();
}