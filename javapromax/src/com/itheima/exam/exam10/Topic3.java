package com.itheima.exam.exam10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Topic3 {
    public static void main(String[] args) {
        //其实休息日
        LocalDate startDate = LocalDate.of(2022,02, 03);
        // 用户输入年月
        System.out.println("请您输入年月，注意：月份必须是2022年2月之后的月份");
        Scanner sc = new Scanner(System.in);
        String s = sc.next() + "-01";
        LocalDate start = LocalDate.parse(s);
        LocalDate end = start.plusMonths(1).minusDays(1);
      //  System.out.println(end);


        // 存入每一天日期对象
        List<Day> days = new ArrayList<>();
        LocalDate temp = startDate;
        while (temp.isBefore(end)){
            Day day = new Day(temp);
            temp = temp.plusDays(1);
            days.add(day);
        }
      //  System.out.println(days);

        // 判断哪一天是休息日
        for (int i = 0; i < days.size(); i+=3) {
            Day day = days.get(i);
            day.setFlag(true);
           // day.print();
        }
        //展示当月休息日情况
        ArrayList<Day> days1 = new ArrayList<>();
        for (int i = 0; i < days.size(); i++) {
            Day day = days.get(i);
            if (day.getData().isBefore(start)){
                continue;
            }
            days1.add(day);
            day.print();
        }
        //判断哪一天休息日是周六或者周日
        for (int i = 0; i < days1.size(); i++) {
            Day day = days1.get(i);
            if (day.getData().getDayOfWeek().getValue() == 6){
                System.out.println( "周六"+ "\t"+day.getData()+ "\t" + (day.isFlag()?"[休息]" : "") );
            }else
            if (day.getData().getDayOfWeek().getValue() == 7){
                System.out.println("周日"+ "\t" + day.getData()+ "\t" + (day.isFlag()?"[休息]" : ""));
            }else {
                System.out.println("  \t" +day.getData() + "\t"+ (day.isFlag()?"[休息]" : ""));}
        }

    }
}
