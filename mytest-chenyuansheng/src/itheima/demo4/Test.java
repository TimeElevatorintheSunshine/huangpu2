package itheima.demo4;

import java.time.LocalDate;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        // 第一次休息
        LocalDate start = LocalDate.of(2022, 03, 02);


        System.out.println("请输入需要查询的年月份");
        Scanner sc = new Scanner(System.in);
        String date = sc.next() + "-01";
        LocalDate startDate = LocalDate.parse(date);
        LocalDate endDate = startDate.plusMonths(1).minusDays(1);
        System.out.println(endDate);

        LocalDate temp = start;
        List<Day> days = new ArrayList<>();
        while (!temp.isAfter(endDate)) {
            Day day = new Day(temp);
            days.add(day);
            temp = temp.plusDays(1);
        }
        System.out.println(days);

        for (int i = 0; i < days.size(); i++) {
            Day day = days.get(i);
            if (day.getDate().getDayOfWeek().getValue() == 6 || day.getDate().getDayOfWeek().getValue() == 7) {
                day.setFlag(true);
            }
        }
        System.out.println(days);
        days.get(0).setFlag(true);
        int n = 0;
        for (int i = 0; i < days.size(); i++) {
            Day day = days.get(i);
            if (day.isFlag()) {
                n = 1;
                continue;
            }
            if (n % 4 == 0 && n != 0) {
                day.setFlag(true);
            }
            n++;
        }

        System.out.println(days);
        for (Day day : days) {
            if (day.getDate().isAfter(startDate.minusDays(1))) {
                System.out.println(day);
            }
        }

        while (!temp.isAfter(endDate.plusMonths(5))) {
            Day day = new Day(temp);
            days.add(day);
            temp = temp.plusDays(1);
        }
        //   System.out.println(days);

        for (int i = 0; i < days.size(); i++) {
            Day day = days.get(i);
            if (day.getDate().getDayOfWeek().getValue() == 6 || day.getDate().getDayOfWeek().getValue() == 7) {
                day.setFlag(true);
            }
        }
        //      System.out.println(days);
        n = 0;
        for (int i = 0; i < days.size(); i++) {

            Day day = days.get(i);
            if (day.isFlag()) {
                n = 1;
                continue;
            }
            if (n % 4 == 0 && n != 0) {
                day.setFlag(true);
            }
            n++;
        }

        Map<String, Integer> max = new HashMap<>();
        //     System.out.println(days);
        for (int i = 0; i < days.size(); i++) {
            Day day = days.get(i);
            if (day.getDate().isAfter(startDate.minusDays(1)) && day.isFlag()) {
                if (max.keySet().contains(day.getDate().getMonth().getValue() + "月")) {
                    max.put(day.getDate().getMonth().getValue() + "月", max.get(day.getDate().getMonth().getValue() + "月") + 1);
                } else {
                    max.put(day.getDate().getMonth().getValue() + "月", 1);
                }

            }
        }
        Set<String> set = max.keySet();
        int max1 = 0;
        String maxName = "";
        for (String s : set) {
            if (max.get(s) > max1) {
                maxName = s;
                max1 = max.get(s);
            }
            System.out.println(s + "\t" + max.get(s));
        }
        ArrayList<String> strings = new ArrayList<>();
        for (String s : set) {
            if (max.get(s) == max1){
                strings.add(s);
            }
        }
        System.out.println("最多是：" + strings+ "休息了" + max1 + "天");
    }
}

class Day {
    private LocalDate date;
    private boolean flag;

    @Override
    public String toString() {
        return
               date + "星期"+date.getDayOfWeek().getValue() + (isFlag() == true ? "休息" : "上班");

    }

    public Day() {
    }

    public Day(LocalDate date, boolean flag) {
        this.date = date;
        this.flag = flag;
    }

    public Day(LocalDate date) {
        this.date = date;

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}