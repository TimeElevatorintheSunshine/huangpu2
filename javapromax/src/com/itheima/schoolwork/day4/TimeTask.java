package com.itheima.schoolwork.day4;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimerTask;
/**
 * 秒杀是网上竞拍的一种新方式，指商家在网络平台发布一些超低价格的商品，
 *  让所有买家在同一时间抢购的一种销售方式。由于商品价格非常低廉，通常活动时间一到，商品就会被买
 *
 * 家抢购一空，有时甚至只用一秒钟，所以该种方式被称为秒杀。在秒杀活动页面往往会有一个倒计时的功能，如下图所示：
 */
public class TimeTask extends TimerTask {

    // 定义秒杀开始时间
    private long startTime ;

    // 构造方法，对秒杀开始时间进行初始化
    public TimeTask() throws Exception {

        // 补全代码
//        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
//        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = new Date();
//        String format = s.format(date);
//        String sb = format + " 06:00:00";
//        Date parse = s1.parse(sb);
//        parse.setDate(parse.getDate() + 1);
//        startTime = parse.getTime();

        // 那今天的日子
        LocalDate now = LocalDate.now();
        LocalDate tomorrow = now.plusDays(1);
        String s = tomorrow +  " 06:00:00";

        // 2023-07-20 06:00:00
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(s, dateTimeFormatter);
        Instant i = ldt.toInstant(ZoneOffset.ofHours(8));
        startTime = i.toEpochMilli();
    }

    @Override
    public void run() {                                 // 每一秒执行一次该方法

        // 补全代码
//        Date date = new Date();
//        long now = date.getTime();
//        long l = startTime - now;
//        long hours = l/1000/60/60;
//        long minutes = l/1000/60 - hours*60;
//        long seconds = l/1000-(l/1000/60)*60;
//        System.out.println("即将开始，距开始:"+ hours + "小时" + minutes + "分钟" + seconds+"秒");

        //拿到明天六点时间
        Instant instant = Instant.ofEpochMilli(startTime);
        LocalDateTime tomorrow = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(now, tomorrow);

        System.out.println(duration.toHours() + "小时" + (duration.toMinutes() -duration.toHours()*60 ) + "分钟"+
               (duration.toMillis()/1000-duration.toMinutes()*60));

    }



}
