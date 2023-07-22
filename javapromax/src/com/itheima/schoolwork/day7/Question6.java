package com.itheima.schoolwork.day7;

import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        Set<Integer> bull = new HashSet<>();
        Random r = new Random();
        int data;
        while (bull.size() !=6) {
            data = r.nextInt(33) + 1;
            bull.add(data);
        }
        ArrayList<Integer> bulls = new ArrayList<>();
        bulls.addAll(bull);
        bulls.sort(( o1,o2) ->o1-o2);
        bulls.add(r.nextInt(16)+1);
        System.out.println(bulls);
    }
}
