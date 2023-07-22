package com.itheima.day8.map;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<String> city = new ArrayList<>();
        Collections.addAll(city,"武汉市","襄阳市","宜昌","荆州市","孝感市","鄂州市");
        map.put("湖北省",city);

        System.out.println(map.get("湖北省"));
    }
}
