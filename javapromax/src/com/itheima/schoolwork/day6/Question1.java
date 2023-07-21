package com.itheima.schoolwork.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * "抓阄"是指每人从预先做好记号的纸卷或纸团中摸取一个，以决定做什么。
 * 比如：学羊叫5声、蛙跳10个、吃芥末、喝一杯啤酒、做10个俯卧撑等。
 */
public class Question1 {
    public static void main(String[] args) {
        //1、创建一个集合存储5个人的名称
        ArrayList<String> name = new ArrayList<>();
        Collections.addAll(name, "郭靖", "令狐冲", "段誉", "叶孤城", "杨过");
        //2、创建一个集合存储5个阄的内容
        ArrayList<String> lots = new ArrayList<>();
        Collections.addAll(lots, "学羊叫5声", "蛙跳10个", "吃芥末", "喝一杯啤酒", "做10个俯卧撑");
        //3、遍历名称的集合，获取每一个参与人员的名称
        for (String s : name) {
            //4、生成一个随机数作为存储5个阄的集合的索引，从该集合中随机获取一个元素，并且删除获取到的元素
            Random r = new Random();
            int data = r.nextInt(lots.size());
            //5、在控制台输出结果
            String lot = lots.remove(data);
            System.out.println(s + lot);
        }
    }
}
