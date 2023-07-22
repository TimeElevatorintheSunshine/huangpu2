package com.itheima.schoolwork.day7;


import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Map<Integer, String> bus = new TreeMap<>();
        bus.put(1, "黄花机场T1T2");
        bus.put(2, "木马塅");
        bus.put(3, "大路村");
        bus.put(4, "龙峰");
        bus.put(5, "曹家坪");
        bus.put(6, "檀木桥");
        bus.put(7, "龙华");
        bus.put(8, "韶光");
        bus.put(9, "东湖");
        bus.put(10, "农科院农大");
        bus.put(11, "隆平水稻博物馆");
        bus.forEach((k, v) -> System.out.println(k + " - " + v));
        Scanner sc = new Scanner(System.in);
        Set<Map.Entry<Integer, String>> entries = bus.entrySet();
        int a;
        int b;
        Boolean flag = true;
        String start;
        String end;
        OUT:
        while (true){
            System.out.println("请输入上车站");
            start = sc.next();
            for (Map.Entry<Integer, String> entry : entries) {
                if (entry.getValue().contains(start)) {
                    a  = entry.getKey();
                    flag= false;
                    break OUT;
                }
            }
            if (flag){
                System.out.println("您输入的站点不存在，请重新输入");
            }

        }
        OUT:
        while (true){
            System.out.println("请输入下车站");
            end = sc.next();
            for (Map.Entry<Integer, String> entry : entries) {
                if (entry.getValue().contains(end)) {
                    b  = entry.getKey();
                    flag= true;
                    break OUT;
                }
            }
            if (!flag){
                System.out.println("您输入的站点不存在，请重新输入");
            }

        }
        int c = (b - a);
        int money = c <= 3 ? 3 : c <= 5 ? 4 : (4 + (((c - 4) * 2) > 6 ? 6 : (c - 4) * 2));
        System.out.println("从" + start + "到" + end + "共经过" + c + "站,收费" + money + "元,需要" + c * 2 + "分钟");
    }
}
