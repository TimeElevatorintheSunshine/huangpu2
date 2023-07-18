package com.itheima.exam.exam9;

import java.util.Timer;
import java.util.TimerTask;

public class Start {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimeTask(),0,1000);
    }
}
