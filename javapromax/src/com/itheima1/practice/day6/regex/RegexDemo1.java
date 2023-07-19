package com.itheima1.practice.day6.regex;

public class RegexDemo1 {
    public static void main(String[] args) {
        System.out.println(checkQQ("53253112"));
        System.out.println(checkQQ("sdf213124"));
    }

    public static boolean checkQQ(String qq) {
        return qq != null && qq.matches("[1-9]\\d{4,}");
    }
}
