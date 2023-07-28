package com.itheima.exam1.demo7;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vacation {
    public static void main(String[] args) {
        // 第一次休息日
        LocalDate start = LocalDate.of(2022, 03, 02);
        // 创建对象，封装所有日期，和休息日期
    }
}

class Dat {
    private LocalDate today;
    private boolean flag;

    @Override
    public String toString() {
        return today + "[" + weekday() + flag + "]";
    }

    public String weekday() {
        String[] weeks = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"};
        return weeks[today.getDayOfWeek().getValue() - 1];
    }

    public Dat(LocalDate today, boolean flag) {
        this.today = today;
        this.flag = flag;
    }

    public Dat(LocalDate today) {
        this.today = today;
    }

    public Dat() {
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