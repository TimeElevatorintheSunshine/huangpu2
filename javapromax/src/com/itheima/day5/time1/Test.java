package com.itheima.day5.time1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException, InterruptedException {
        String s = "2023-09-07 09:00:00";
//        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime s1 = LocalDateTime.parse(s,f);
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date s1 = f.parse(s);
        System.out.println("\t\t\t2023年高考倒计时");
        System.out.println("2023年高考时间:2023年09月07日 星期三");
        System.out.println("现在距离2023高考还有");
        long time = s1.getTime();
        Date date = new Date();
        long l = time - date.getTime();
        while (true){
            Thread.sleep(1000);
            l -=1000;
           // 4385781144
            //4385642
            //73094
            //1218
            System.out.println(l/1000/60/60/24 + "天" + (l/1000/60/60 -l/1000/60/60/24*24) +"小时"
                    +(l/1000/60-(l/1000/60/60)*60) +"分钟"+(l/1000-(l/1000/60)*60)+"秒");
        }
    }
}
