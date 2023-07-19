package com.itheima.schoolwork.day4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        System.out.println("请输入年份");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s = s1 + "-01-01";
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parse = LocalDate.parse(s, dt);
        System.out.println(s1 + "的二月有：" + parse.plusMonths(2).minusDays(1).getDayOfMonth() + "天");
        if (parse.plusYears(1).minusDays(1).getDayOfYear() == 366) {
            System.out.println(s1 + "是闰年");
        } else {
            System.out.println(s1 + "不是闰年");
        }
        System.out.println(s1 + "年有" + parse.plusYears(1).minusDays(1).getDayOfYear() + "天");

    }
}
