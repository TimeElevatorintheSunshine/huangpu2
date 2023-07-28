package com.itheima.day10.io2;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;

public class FileWriterDemo1 {
    public static void main(String[] args) {
        try (
                Writer fw
                        = new FileWriter("src/com/itheima/day10/note1.txt")
        ){
//            // 字符
//            fw.write('c');
//            fw.write("我");
//            fw.write("爱");
//            fw.write("53" );
//            fw.write("\r\n");
//            // 字符串
//            fw.write("阿斯顿马丁");
//            fw.write("\r\n");
//            // 写字符串一部分出去
//            fw.write("青蛙与公主",0,2);
//            fw.write("\r\n");
//            // 写一个字符数组出去
//            char[] chars = "撒旦的复活".toCharArray();
//
//            //fw.write(chars);
//            fw.write("\r\n");
//            // 写字符数组一部分出去
//            fw.write(chars,2,3);

            Scanner sc = new Scanner(System.in);
            while (true) {
                String next = sc.next();
                if (next.equals("exit")){
                    break;
                }
                fw.append(next).append(next).flush();
                fw.write("\r\n");


            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
