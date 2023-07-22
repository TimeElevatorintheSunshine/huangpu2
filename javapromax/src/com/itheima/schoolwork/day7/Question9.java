package com.itheima.schoolwork.day7;

import java.util.HashMap;
import java.util.Set;

public class Question9 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("001","李晨");
        map.put("002","范冰冰");
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("001","马云");
        map1.put("002","马化腾");
        HashMap<String, HashMap<String, String>> map3 = new HashMap<>();
        map3.put("Java基础班",map);
        map3.put("Java就业班",map1);
        Set<String> set = map3.keySet();
        for (String s : set) {
            System.out.println(s + map3.get(s));
        }
    }
}
