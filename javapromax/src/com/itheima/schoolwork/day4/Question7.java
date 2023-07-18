package com.itheima.schoolwork.day4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * 某公司人事举办了这样一个活动,凡是入职6周年的员工,
 * 赠送一个精美小礼品,于是员工纷纷去计算了自己的入职年限,请设计程序,帮同事们计算出入职年限.
 */
public class Question7 {
    public static void main(String[] args) {
        System.out.println("请输入您的入职年份");
        Scanner scanner = new Scanner(System.in);
        String year = scanner.next() + "-01-01";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate parse = LocalDate.parse(year, dtf);
        LocalDate now = LocalDate.now();
        System.out.println("您的入职年份是" + (now.getYear() - parse.getYear()));

    }
}
