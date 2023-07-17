package com.itheima.exam.exam9;

import java.time.LocalDate;

public class Day {
    private LocalDate date;
    private boolean flag; // true 休息

    @Override
    public String toString() {
        return "Day{" +
                "date=" + date +
                ", flag=" + flag +
                '}';
    }
    public void printInfo() {
        System.out.print(date + (flag? "[休息] " : " "));
    }

    public Day() {
    }
    public Day(LocalDate date) {
        this.date = date;

    }
    public Day(LocalDate date, boolean flag) {
        this.date = date;
        this.flag = flag;
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
