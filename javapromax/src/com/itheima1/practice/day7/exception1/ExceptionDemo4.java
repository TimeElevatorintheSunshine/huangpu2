package com.itheima1.practice.day7.exception1;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo4 {public static void main(String[] args) {
    // 异常的处理方案
    System.out.println("~~~~~~~");
    try {
        parseDate("2033-03.22 11:23:33");
    } catch (Exception e) {
        e.printStackTrace();
    }
    System.out.println("~~~~~~~");
}

    public static void parseDate(String s) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = simpleDateFormat.parse(s);
        System.out.println(parse);

        FileInputStream is = new FileInputStream("D:\\aaa");
}
    /*public static void main(String[] args) {
        // 异常的处理方案
        System.out.println("~~~~~~~");
        try {
            parseDate("2033-03.22 11:23:33");
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("~~~~~~~");
    }

    public static void parseDate(String s) throws ParseException, FileNotFoundException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = simpleDateFormat.parse(s);
        System.out.println(parse);

        FileInputStream is = new FileInputStream("D:\\aaa");
    }*/
}
