package com.itheima.day1.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 暂时不用考虑数据太大的问题，把本题的核心思路写出来即可
 * 比如：
 * 	输入：x = 123
 * 	输出：321
 * 	输入：x = -123
 * 	输出：-321
 * 	输入：x = 120
 * 	输出：21
 * 	输入：x = 0
 * 	输出：0
 * 要注意，考虑到特殊情况：2147483647，反转之后就超出范围了，此时就要返回0
 */
public class Test4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            if (data.startsWith("-")){
                if (i == data.length() -1)break;
                stringBuilder1.append(data.charAt(0));
                stringBuilder.append(data.substring(1));
                break;
            }else if ((""+ data.charAt(data.length() -1)).contains("0")){
                if (data.length() >1 ){
                stringBuilder.append(data.substring(0,data.length()-1));}else {
                    stringBuilder.append(data.substring(0));
                }

                break;
            }else {
               stringBuilder.append(data);
               break;
            }
        }
        stringBuilder = stringBuilder.reverse();
        stringBuilder1.append(stringBuilder);
        int count = 0;
        long  sum = 0l;
        if (stringBuilder1.length() >= 10  ){
            if (stringBuilder1.length() == 11) {
                for (int i = 10; i >= 1; i--) {
                    int number = (int) ((stringBuilder1.charAt(i) - 48) * Math.pow(10,count++));
                    sum += number;
                }
            }else {
                for (int i = stringBuilder1.length() -1; i >= 0; i--) {
                    int number = (int) ((stringBuilder1.charAt(i) - 48) * Math.pow(10,count++));
                    sum += number;
                }
            }
        }
        if (sum > Integer.MAX_VALUE ){
            System.out.println("0");
        }else {
        System.out.println(stringBuilder1);}

    }
}
