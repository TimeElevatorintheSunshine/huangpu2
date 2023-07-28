package com.itheima.day10.io2;


import java.io.*;


public class Test {
    public  static final String SRC_VIDEO = "D:\\note\\徐磊老师\\黑马黄埔班基础进阶阶段中期考试试卷\\视频\\04、第四题COPY - Copy.avi";
    public  static final String SRC_VIDEO1 = "D:\\note\\徐磊老师\\黑马黄埔班基础进阶阶段中期考试试卷\\视频";

    public static void main(String[] args) {
copy02();
    }
    public static void copy01(){
        long start = System.currentTimeMillis();
        try (
               InputStream is = new FileInputStream(SRC_VIDEO);
               OutputStream os = new FileOutputStream(SRC_VIDEO1+ "1.avi")

        ){
            int b;
            // 按照行都字符的功能
            while ((b = is.read() ) != -1){
               os.write(b);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("低级字节流"+(end - start)/1000);
    }
    public static void copy02(){
        long start = System.currentTimeMillis();
        try (
               InputStream is = new FileInputStream(SRC_VIDEO);
               OutputStream os = new FileOutputStream(SRC_VIDEO1 + "2.avi")

        ){
            byte[] buffer = new byte[1024];
            int b;
            // 按照行都字符的功能
            while ((b = is.read(buffer) ) != -1){
               os.write(buffer,0,b);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
