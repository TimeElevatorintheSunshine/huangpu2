package com.itheima.day1.test5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        System.out.println(date.getTime());
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(s.format(date));
        System.out.println(s.format(date.getTime()));
        String str = "2023-11-11 10:22:22";
        System.out.println(s.parse(str));

    }
}
