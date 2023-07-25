package com.itheima.exam1.黑马黄埔班基础进阶阶段中期考试试卷.题目.Timer;

import java.util.Timer;

public class Start {

    public static void main(String[] args) {
        // 创建一个定时器对象
        Timer timer = new Timer() ;
        timer.schedule(new TimeTask(), 0 , 1000);         // 每隔1秒执行一次new TimeTask()里的run方法
    }
}
