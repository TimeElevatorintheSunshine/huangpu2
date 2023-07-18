package com.itheima.schoolwork.day4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 1. 已知日期字符串:"2015-10-20",将该日期字符串转换为日期对象；
 * 2. 将(1)中的日期对象转换为日历类的对象；
 * 3. 根据日期对象获取该日期是星期几,以及这一年的第几天
 * 4. 通过键盘录入日期字符串，格式(2015-10-20)
 */
public class Question4 {
    public static void main(String[] args) throws Exception{
        System.out.println("请输入日期");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(s);

        Calendar instance = Calendar.getInstance();

        instance.setTimeInMillis(parse.getTime());
        instance.add(Calendar.MONTH,1);
        System.out.println(instance);
        System.out.println(instance.get(Calendar.YEAR ) + "年-" +instance.get(Calendar.MONTH) +"月-"
         +instance.get(Calendar.DAY_OF_MONTH)+"日是星期" +instance.get(Calendar.DAY_OF_WEEK)+",是"+
                instance.get(Calendar.YEAR ) + "年的第"+instance.get(Calendar.DAY_OF_YEAR ) + "天") ;


    }
}
