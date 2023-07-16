package com.itheima.day1.test5;

import java.time.LocalDateTime;

public class Test4 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.withDayOfMonth(4));
        LocalDateTime l = now.plusDays(3);
        System.out.println(l.isBefore(now));
        System.out.println(now);
        System.out.println(now.toLocalTime());
    }
}
