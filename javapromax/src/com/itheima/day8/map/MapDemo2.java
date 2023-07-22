package com.itheima.day8.map;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("手表", 2);
        map.put("苹果", 204);
        map.put("华为", 999);
        map.put("活着", 1);
        map.put("苹果", 1);
        // 键找值
        Set<String> s = map.keySet();
        for (String s1 : s) {
            System.out.println(s1 + "--" + map.get(s1));
        }
        // 键值对
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        /*map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s + integer);
            }
        });*/
        map.forEach((k,v)-> System.out.println(k + v));
    }
}
