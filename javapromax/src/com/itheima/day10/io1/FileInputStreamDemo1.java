package com.itheima.day10.io1;

import java.io.FileInputStream;


public class FileInputStreamDemo1 {
    public static void main(String[] args) {
        try (
                // 创建文件字节输入流管道与源文件接通a
                FileInputStream is
                      = new FileInputStream("src/com/itheima/day10/note1.txt");
        ){
            // 开始读取字节
            // 每次读取一个字节返回，没有字节可读返回-1
            int b1;
            // 使用循环
            while ((b1 = is.read()) != -1){
                // 自带换行
                System.out.print((char) b1);

            }

            // 拓展内容
            // 使用FileInputStream每次读取一个字节，读取性能较差，并且读取汉字输出会乱码


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
