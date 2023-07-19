package com.itheima.schoolwork.day4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // 定义首次休息日时间
        LocalDate start = LocalDate.of(2020, 2, 1);

        // 输入需要查询的月份，解析成时间
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要查询的年月");
        String s = scanner.next() + "-01";
        LocalDate startDate = LocalDate.parse(s);
        LocalDate end = startDate.plusMonths(1).minusDays(1);
        System.out.println(end.getDayOfMonth());
        System.out.println(startDate.lengthOfMonth());
        System.out.println("间隔天数：" + (end.toEpochDay() - start.toEpochDay()));
        System.out.println("间隔天数：" + ChronoUnit.DAYS.between(start,end));
        //   System.out.println("间隔天数：" + (end.getDayOfYear() - start.getDayOfYear()));
       // System.out.println("间隔天数：" + (Duration.between(end,start).toDays()));

       /* // 录入天数对象
        List<Day> days = new ArrayList<>();
        while (!start.isAfter(end)) {
            Day day = new Day();
            day.setDate(start);
            days.add(day);
            start = start.plusDays(1);
        }

        // 打印所有休息日
        List<Day> days2= new ArrayList<>();
        for (int i = 0; i < days.size(); i += 4) {
            Day day = days.get(i);
            day.setFlag(true);
            days2.add(day);
        }
        System.out.println(days2);
        // 打印月份休息日
        int count = 0;
        List<Day> days1 = new ArrayList<>();
        for (int i = 0; i < days2.size(); i++) {
            Day day = days2.get(i);
            if (day.getDate().isAfter(startDate.minusDays(1))) {
                if (day.isFlag()) {
                    days1.add(day);
                    count++;
                }
            }
        }
        System.out.println(days1);
        System.out.println(count);

        // 标注休息日
        for (int i = 0; i < days2.size(); i++) {
            Day day = days2.get(i);
            if (day.getDate().getDayOfWeek().getValue() == 6){
                System.out.print("[" + day.getDate() + "]\t");
            }else if (day.getDate().getDayOfWeek().getValue() == 7){
                System.out.print("[" + day.getDate() + "]\t");
            }else {
                System.out.print(day.getDate()+"\t");
            }
        }*/
        // 录入所有天数
        List<LocalDate> ld = new ArrayList<>();
        while (!start.isAfter(end)){
            ld.add(start);
            start = start.plusDays(1);
        }

        // 打印所有休息日
        List<LocalDate> ld1 = new ArrayList<>();
        for (int i = 0; i < ld.size(); i+=2){
            LocalDate localDate = ld.get(i);
            if (localDate.isAfter(startDate.minusDays(1))){
                ld1.add(localDate);
                if (localDate.getDayOfWeek().getValue() == 6){
                    System.out.print("[" + localDate+ "]\t");
                }else if (localDate.getDayOfWeek().getValue() == 7){
                    System.out.print("[" +localDate + "]\t");
                }else {
                    System.out.print(localDate+"\t");
                }
            }
        }

    }
}
