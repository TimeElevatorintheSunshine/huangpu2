package com.itheima.day1.test5;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test6 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println(now.plusMillis(33));
        System.out.println(now.minusMillis(22));
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);
        System.out.println(df.format(now1));
    }
}
