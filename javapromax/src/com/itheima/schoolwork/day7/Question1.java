package com.itheima.schoolwork.day7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Predicate;

public class Question1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("2352352434124hhuhu");
        set.add("2352352344124hhu24");
        set.add("235235234412412524");
        set.add("0352352341424hhuhu");
        set.add("23523521244421421x");
        set.add("23224sda123542huhu");
        set.add("125355234124h4huhu");
        for (String s : set) {
            if (s.matches("[1-9][0-9]{16}[0-9Xx]")){
                System.out.println(s);
            }
        }
    }
}
