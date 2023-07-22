package com.itheima.day8.map;

import java.util.*;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("手表", 2);
        map.put("苹果", 204);
        map.put("华为", 999);
        map.put("活着", 1);
        map.put("苹果", 1);
        map.put(null, null);
        System.out.println(map);
        System.out.println(map.size());
        // 清空集合
        // map.clear();
        // 判断是否为空
        map.isEmpty();
        // 根据某个键获得他的值
        System.out.println(map.get("华为")); // 999
        System.out.println(map.remove("手表")); // 删除

        // 判断是否包含某个键
        System.out.println(map.containsKey("苹果"));
        // 判断是否包含某个值
        System.out.println(map.containsValue(999));
        // 获得所有键装入set集合
        Set<String> strings = map.keySet();
        System.out.println(strings);

        // 获得所有值装入Collection集合
        Collection<Integer> values = map.values();
        System.out.println(values);

    }
}
