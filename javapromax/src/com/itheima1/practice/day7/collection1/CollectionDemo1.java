package com.itheima1.practice.day7.collection1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class CollectionDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("灭绝师太");
        list.add("灭绝师太");
        list.add("灭绝师太");
        list.add("灭绝师太");
        list.add("灭绝师太");
        list.add("灭绝师太");

        Random r = new Random();

        int i = r.nextInt(list.size() - 1);
        System.out.println("恭喜黑马唐三，你的老婆是" + list.get(i));

        HashSet<String> l = new HashSet<>();
        l.add("喜羊羊");
        l.add("懒羊羊");
        l.add("美羊羊");
        l.add("暖羊羊");
        System.out.println(l);


    }
}

