package com.itheima1.practice.day5.jdk8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 *  目标：掌握JDK 8新增的DateTimeFormatter格式化器的用法。
 */
public class Test6_DateTimeFormatter {
    public static void main(String[] args) {
        // 1、创建一个日期时间格式化器对象出来。
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        // 2、对时间进行格式化
        LocalDateTime now = LocalDateTime.now();
        String format = dtf.format(now);  //正向格式化
        System.out.println(format);

        // 3、格式化时间，其实还有一种方案。
        String format1 = now.format(dtf);// 反向格式化
        System.out.println(format1);

        // 4、解析时间：解析时间一般使用LocalDateTime提供的解析方法来解析。
        String dateStr = "2029年12月12日 12:12:11";
        LocalDateTime parse = LocalDateTime.parse(dateStr, dtf);

        System.out.println(parse);

    }
}






