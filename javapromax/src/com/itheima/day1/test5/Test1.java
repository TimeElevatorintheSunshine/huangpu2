package com.itheima.day1.test5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args)throws Exception {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = sd.parse("2023-11-11 00:00:00");
        Date end = sd.parse("2023-11-11 00:10:00");
        Date xj = sd.parse("2023-11-11 00:01:18");
        Date xp = sd.parse("2023-11-11 00:10:51");
        if (xj.after(start) &&xj.before(end)){
            System.out.println("小贾成功");
        }else {
            System.out.println("小贾失败");
        }
        if (xp.after(start) &&xp.before(end)){
            System.out.println("小鹏成功");
        }else {
            System.out.println("小鹏失败");
        }
    }
}
