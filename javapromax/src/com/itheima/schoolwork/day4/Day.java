package com.itheima.schoolwork.day4;

import java.time.LocalDate;

public class Day {
    private LocalDate date;
    private boolean flag;


    @Override
    public String toString() {
        return  "" +date;
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
