package com.itheima.day1.test5;

import java.util.Calendar;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeInMillis());
        calendar.set(Calendar.DAY_OF_MONTH,3);
        System.out.println(calendar);
        calendar.add(Calendar.DAY_OF_MONTH,1);

        System.out.println(calendar);
    }
}
