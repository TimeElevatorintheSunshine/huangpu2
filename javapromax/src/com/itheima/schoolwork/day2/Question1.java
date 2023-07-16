package com.itheima.schoolwork.day2;


import java.util.Scanner;

/**
 * 1.定义电视类TV，要求包含：
 *    1)成员变量:名称 name（ String s）；
 *    2)构造器:空参、满参构造器；
 *    3)成员方法:public void play(String channel) ,方法内,打印输出 "xx电视正在播放xxx节目"（channel表示电视节目);
 *
 * 2.定义遥控器类RemoteControl,包含:
 *     成员方法:public void  controlTV(TV tv):方法内输出"遥控器控制电视",然后提示用户键盘录入一个字符串作为电视节目信息,调用tv的play方法,将节目信息作为参数传入；
 * 3.定义测试类Test，在main方法实现以下功能：
 * 	* 创建TV对象；
 * 	* 创建RemoteControl对象,调用其controlTV的方法
 */
public class Question1 {
    public static void main(String[] args) {
        TV tv = new TV("东方卫视");
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.controlTV(tv);
    }
}
class RemoteControl{
    public void  controlTV(TV tv){
        System.out.println("遥控器控制电视");
        System.out.println("请录入电视节目信息");
        Scanner sc = new Scanner(System.in);
        tv.play(sc.next());
    }
}
class TV{
    private String name;
    public void play(String channel){
        System.out.println(name + "电视正在播放" + channel +"节目");
    }
    public TV() {
    }

    public TV(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}