package com.itheima1.practice.day5.date1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        // 目标：完成秒杀案例。
        // 1、把开始时间、结束时间、小贾下单时间、小皮下单时间拿到程序中来。
       String xj = "2023年11月11日 00:01:18";
       String xp = "2023年11月11日 00:10:51";
       String start = "2023年11月11日 00:00:00";
       String end = "2023年11月11日 00:10:00";

        // 2、把字符串的时间解析成日期对象。
        SimpleDateFormat s = new SimpleDateFormat("y年M月d日 H:m:s");
        System.out.println(s.format(new Date()));
        Date parse = s.parse(xj);
        Date parse1 = s.parse(xp);
        Date parse2 = s.parse(start);
        Date parse3 = s.parse(end);
        System.out.println(parse);
        // 3、开始判断小皮和小贾是否秒杀成功了。
        // 把日期对象转换成时间毫秒值来判断
        if (parse.before(parse3) && parse.after(parse2)){
           System.out.println("小贾成功");
       }else {
           System.out.println("小贾失败");
       }
       if (parse1.before(parse3) && parse1.after(parse2)){
           System.out.println("小鹏成功");
       }else {
           System.out.println("小鹏失败");
       }
    }
}










