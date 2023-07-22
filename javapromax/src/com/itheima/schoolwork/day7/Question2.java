package com.itheima.schoolwork.day7;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Question2 {
    public static void main(String[] args) {
        Set<Integer> bull = new HashSet<>();
        Random r = new Random();
        int data;
        while (bull.size() !=6) {
            data = r.nextInt(33) + 1;
            bull.add(data);
        }
        System.out.println("红球" + bull + "篮球" + (r.nextInt(16)+1));
    }
}
