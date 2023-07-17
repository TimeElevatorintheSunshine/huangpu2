package com.itheima.exam.exam9;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        // 起始休息日
        LocalDate startDate = LocalDate.of(2022,2,3);

        // 拿到用户查询月份
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入要查询的年份和月份，以便为你展示该月休息日（注意：必须是2022-02月开始或之后：）");
        String currentDate = sc.next() + "-01";
        LocalDate endMonthFistDate = LocalDate.parse(currentDate);
        LocalDate endDate = endMonthFistDate;
        // 拿到这个月份的最后一天的日子，作为截至日期
        endDate = endDate.plusMonths(1).minusDays(1);

        // 3、从起始日子一直拿到截止日子中的全部日子对象，方便后面进行信息查询。
        List<Day> days = new ArrayList<>();
        while (!startDate.isAfter(endDate)){
            Day day = new Day(startDate);
            days.add(day);
            startDate = startDate.plusDays(1);
        }
        System.out.println("从2022年2月3日开的全部日子：");
        System.out.println(days);
        for (int i = 0; i < days.size(); i+=3) {
            Day day = days.get(i);
            day.setFlag(true);
            day.printInfo();
        }
        System.out.println(days);
        // 5、展示出当月的休息日情况。
        List<Day> days1 = new ArrayList<>();
        for (int i = 0; i < days.size(); i++) {
            Day day = days.get(i);
            if (day.getDate().isBefore(endMonthFistDate)){
                continue;
            }
            days1.add(day);
            day.printInfo();
        }
        for (int i = 0; i < days1.size(); i++) {
            Day day = days1.get(i);
            if (day.getDate().getDayOfWeek().getValue() == 6){
                System.out.println(day.getDate() + (day.isFlag()?"[休息] " : " ") + "周六");
            }else
            if (day.getDate().getDayOfWeek().getValue() == 7){
                System.out.println(day.getDate() + (day.isFlag()?"[休息] " : " ") + "周日");
            }else {
            System.out.println(day.getDate() + (day.isFlag()?"[休息] " : " "));}
        }

    }
}
