package com.itheima1.practice.day5.date1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        // 1、准备一些时间
        Date date = new Date();

        SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        // 2、格式化日期对象，和时间 毫秒值。
        String format = s.format(date);
        String format1 = s.format(date.getTime());
        System.out.println(format);
        System.out.println(format1);

        // 目标：掌握SimpleDateFormat解析字符串时间 成为日期对象。
        String str = "2022-03-22 21:33:11";
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = s1.parse(str);
        System.out.println(parse);
    }
}
