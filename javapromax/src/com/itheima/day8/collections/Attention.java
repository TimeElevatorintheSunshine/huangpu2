package com.itheima.day8.collections;



import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class Attention {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("喜羊羊");
        l.add("懒羊羊");
        l.add("美羊羊");
        l.add("美羊羊1");
        l.add("暖羊羊");
//        Iterator<String> it = l.iterator();
//        while (it.hasNext()){
//            String next = it.next();
//            if ("美羊羊".equals(next)){
//                l.remove(next);
//            }
//        }
        Iterator<String> it = l.iterator();
        while (it.hasNext()){
            String next = it.next();

            if ("美羊羊1".equals(next)){
                it.remove();
            }
        }
        System.out.println(l);


        // 增强for只适合遍历

    }
}
