package com.itheima.day1.test5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Test7 {
    public static void main(String[] args){
        LocalDate now = LocalDate.now();
        LocalDate localDate = now.withMonth(2);
        Period period = Period.between(now, localDate);
        System.out.println(period);

        System.out.println(period.getMonths());
        LocalDateTime now1 = LocalDateTime.now();
        LocalDateTime localDateTime = now1.withMonth(3);
        Duration between = Duration.between(now1, localDateTime);
        System.out.println(between);
        System.out.println(between.toNanos());
    }
}
