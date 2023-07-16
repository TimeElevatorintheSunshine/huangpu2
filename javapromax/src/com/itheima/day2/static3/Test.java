package com.itheima.day2.static3;

import java.util.ArrayList;

public class Test {
    public static String name;
    public static ArrayList<String> list = new ArrayList<>();
    // 静态代码块:与类一起加载，自动优先先执行一次
    static {
        System.out.println("=======静态代码块被处罚执行======");
        name = "黑马";
        list.add("♦3");
        list.add("♠3");
        list.add("♥3");
        list.add("♣3");
    }
    public static void main(String[] args) {
        // 掌握静态代码块的特点、应用场景
        System.out.println("=====main=====");
        System.out.println(name);
        System.out.println(list);
    }
}
