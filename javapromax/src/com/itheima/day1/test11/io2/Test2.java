package com.itheima.day1.test11.io2;

import java.io.*;
import java.nio.Buffer;

public class Test2 {
    public static void main(String[] args) {
        try(
                BufferedInputStream is = new BufferedInputStream(new FileInputStream("D:\\projetforlearn\\heima\\基础加强14天课程\\day10-IO流（二）\\视频\\144、IO流：字符流-文件字符输出流.mp4"));
                BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("D:\\projetforlearn\\heima\\基础加强14天课程\\day10-IO流（二）\\视频\\144、IO流：字符流-文件字符输出流1.mp4"));
                ) {
            byte[] buffer = new byte[1];
            int len;
            while ((len = is.read(buffer)) != -1){
                os.write(buffer, 0, len);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
