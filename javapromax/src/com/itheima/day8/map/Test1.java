package com.itheima.day8.map;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Random r = new Random();
        Set<String> set = map.keySet();
        for (int i = 0; i < 80; i++) {
            String people = (char) (r.nextInt(4) + 65) + "";
           /* if (map.keySet().contains(people)){
                    map.put(people,map.get(people) + 1);
                }else {
                    map.put(people,1);
                }*/
            map.put(people, map.keySet().contains(people) ? map.get(people) + 1 : 1);
        }
        map.forEach((k, v) -> System.out.println(k + v));

    }
}
