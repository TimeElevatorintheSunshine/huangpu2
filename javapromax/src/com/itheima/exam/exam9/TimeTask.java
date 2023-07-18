package com.itheima.exam.exam9;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimerTask;

public class TimeTask extends TimerTask {
    private LocalDateTime startTime;

    public TimeTask() {
        String s = "2023-09-07 09:00:00";
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        startTime = LocalDateTime.parse(s,f);

        System.out.println("\t\t\t2023年高考倒计时");
        System.out.println("2023年高考时间:2023年09月07日 星期三");
        System.out.println("现在距离2023高考还有");


    }

    @Override
    public void run() {
        LocalDateTime now = LocalDateTime.now();
        Duration between = Duration.between(now,startTime );
        System.out.println(between.toDays() + "天" + (between.toHours()-(between.toDays()*24))
                + "小时" + (between.toMinutes()-between.toHours()*60)+ "分钟" +(between.toMillis()-between.toMinutes()*60*1000)/1000 + "秒");

    }
}
