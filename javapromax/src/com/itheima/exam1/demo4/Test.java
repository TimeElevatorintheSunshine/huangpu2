package com.itheima.exam1.demo4;

import java.time.LocalDate;
import java.util.*;

public class Test {
    public static int maxRestDays;
    public static void main(String[] args) {
        // 1、先请用户输入要查询的月份信息。
        Scanner sc = new Scanner(System.in);
        System.out.println("请小泰输入查询的月份（月份必须是2022年03月之后的月份）：");
        String month = sc.next(); // 2023-05
        LocalDate monthLd = LocalDate.parse(month + "-01");
        // 得到这个月的最后一天日子
        LocalDate lastLd = monthLd.plusMonths(1).minusDays(1);

        // 2、找出2022-03-02号到输入月份最后一天的全部日子。
        List<Day> allLd = getAllRestDays(lastLd);
        System.out.println(allLd);

        // 4、找出当前的休息情况
        printCurrentMonthRest(monthLd, allLd);

        // 5、查询出小泰从当月到未来5个月，每个月的休息日，找出最高休息月份和详情。
        System.out.println("当月到未来6个月的休息情况如下：");
        Map<LocalDate, Integer> info = new HashMap<>();
        LocalDate now = LocalDate.now();
        LocalDate localDate = LocalDate.of(now.getYear(), now.getMonth() , 1);
        // 拿到未来5个月，最后一个月份的日子。
        LocalDate lastMonthDay = localDate.plusMonths(6).minusDays(1);
        List<Day> allRestDays = getAllRestDays(lastMonthDay);

        for (int i = 0; i < 6; i++) {
            int number = getRestNumberByMonth(allRestDays, localDate);
            info.put(localDate, number);
            localDate = localDate.plusMonths(1);
        }
        System.out.println(info);

        // 最大休息天数，找其月份
        List<LocalDate> maxRestMonth = new ArrayList<>();
        info.forEach((ld, num)->{
            if(num == maxRestDays) maxRestMonth.add(ld);
        });
        System.out.println("未来六个月休息每月最多休息日：" + maxRestDays + "对应月份分别如下：");
        System.out.println(maxRestMonth);

        // 找出休息月份的详情。
        for (LocalDate date : maxRestMonth) {
            List<Day> allRestDays1 = getAllRestDays(date.plusMonths(1).minusDays(1));
            printCurrentMonthRest(date, allRestDays1);

        }
    }

    public static int getRestNumberByMonth(List<Day> days, LocalDate nowFistDay){
        // 开始时间： nowFistDay
        // 结束时间：
        LocalDate nowLastDay = nowFistDay.plusMonths(1).minusDays(1);
        int count = 0;
        for (Day day : days) {
            LocalDate today = day.getToday();
            if(!today.isBefore(nowFistDay) && !today.isAfter(nowLastDay)) {
                // 判断这一天是否是休息
                if(day.isFlag()) count++;
            }
            if(today.isAfter(nowLastDay)) break;
        }
        if(count > maxRestDays) maxRestDays = count;
        return count;
    }

    public static void printCurrentMonthRest(LocalDate fistDay, List<Day> allLd){
        System.out.println("从" + fistDay + "开始的休息情况如下：");
        for (Day day : allLd) {
            if(!day.getToday().isBefore(fistDay)){
                System.out.print(day + " ");
            }
        }
        System.out.println();
    }

    private static List<Day> getAllRestDays(LocalDate lastLd) {
        List<Day> allLd = new ArrayList<>();
        LocalDate startLd = LocalDate.parse("2022-03-02");
        while (!startLd.isAfter(lastLd)) {
            Day day = new Day(startLd);
            allLd.add(day);
            startLd = startLd.plusDays(1);
        }

        // 3、标记每个日子的休息情况。
        int count = 3;
        allLd.get(0).setFlag(true);
        for (int i = 1; i < allLd.size(); i++) {
            // 先拿到当天日期
            Day day = allLd.get(i);
            if(day.getWeekValue() == 6 || day.getWeekValue() == 7) {
                day.setFlag(true);
                count = 3;
            }else {
                if(count == 0 ){
                    day.setFlag(true);
                    count = 3;
                }else{
                    count--;
                }
            }
        }
        return allLd;
    }
}
class Day{
    private LocalDate today;
    private boolean flag;

    @Override
    public String toString() {
        return today+ "[" + getWeek() + (isFlag()?"-休息]":"-上班]") ;
    }
    public int getWeekValue(){

        return today.getDayOfWeek().getValue();
    }
    public String getWeek(){
        String[] weeks = {"星期一","星期二","星期三","星期四","星期五","星期六","星期天"};
        return weeks[today.getDayOfWeek().getValue()-1];
    }

    public Day() {
    }

    public Day(LocalDate today, boolean flag) {
        this.today = today;
        this.flag = flag;
    }public Day(LocalDate today) {
        this.today = today;

    }

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}