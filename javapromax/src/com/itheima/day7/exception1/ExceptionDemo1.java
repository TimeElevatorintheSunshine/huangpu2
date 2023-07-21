package com.itheima.day7.exception1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    public static void main(String[] args) throws ParseException {
        int[] arr = {11,22,33};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // System.out.println(arr[3]); // ArrayIndexOutOfBoundsException 程序出现异常，后面代码不执行
        //  System.out.println(10 / 0 ); // ArithmeticException

        try {
            parseDate("2033-12,12 20:22:22");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("程序结束");
    }
public static void parseDate(String s) throws ParseException {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date parse = simpleDateFormat.parse(s);
    System.out.println(parse);

}
}
