package com.itheima.schoolwork.day7;

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        String s = "1.2, 3.4, 5.6, 7.8, 5.56, 44.55";
        String[] split = s.split(",");
        Map<Object, Object> map = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split("\\.");
            map.put(split1[0],split1[1]);
        }
        Set<Object> objects = map.keySet();
        Collection<Object> values = map.values();
        System.out.println(objects);
        System.out.println(values);

    }
}
