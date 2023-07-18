package com.itheima.exam.exam10;

import java.time.LocalDate;

public class Day {
    private LocalDate data;
    private boolean flag;

    public void print(){
        System.out.println(data + ":" + (flag?"休息":""));
    }
    @Override
    public String toString() {
        return "Day{" +
                "data=" + data +
                ", flag=" + flag +
                '}';
    }

    public Day() {
    }

    public Day(LocalDate data, boolean flag) {
        this.data = data;
        this.flag = flag;
    }
    public Day(LocalDate data) {
        this.data = data;

    }
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
