package com.itheima1.practice.day5.date1;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        // 创建一个Date的对象：代表系统当前时间信息的。
        Date date = new Date();
        System.out.println(date);

        long time = date.getTime();
        System.out.println(time);

        // 把时间毫秒值转换成日期对象
        time += 100*1000;
        Date date1 = new Date(time);
        System.out.println(date1);

        // 直接把日期对象的时间通过setTime方法进行修改
        Date date2 = new Date();
        date2.setTime(time);
        System.out.println(date2);
    }
}
