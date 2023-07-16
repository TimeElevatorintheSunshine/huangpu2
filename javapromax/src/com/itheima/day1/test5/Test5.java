package com.itheima.day1.test5;

import java.time.DayOfWeek;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {
        Set<String> av = ZoneId.getAvailableZoneIds();
        System.out.println(av);
        System.out.println(ZoneId.systemDefault());
        System.out.println(ZoneId.of("America/Cuiaba"));

        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/Cuiaba"));
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.withDayOfMonth(3));


    }
}
