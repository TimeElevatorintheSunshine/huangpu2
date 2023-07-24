package com.itheima.day1.test11.io2;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        try(
                InputStream is = new FileInputStream("D:\\projetforlearn\\heima\\基础加强14天课程\\day10-IO流（二）\\视频\\144、IO流：字符流-文件字符输出流.mp4");
                OutputStream os = new FileOutputStream("D:\\projetforlearn\\heima\\基础加强14天课程\\day10-IO流（二）\\视频\\144、IO流：字符流-文件字符输出流1.mp4");
                ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1){
                os.write(buffer, 0, len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
