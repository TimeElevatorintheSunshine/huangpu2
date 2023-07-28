package com.itheima.day10.io1;

import java.io.FileOutputStream;

import java.io.OutputStream;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) {
        try (
                OutputStream os = new FileOutputStream("src/com/itheima/day10/note1.txt",true)
        ) {
            os.write(97);
            os.write('b');
            //   os.write('徐'); // 写徐的第一个字节
            os.write("\r\n".getBytes()); // 换行
            byte[] buffer = {97,49,98,56,99};
            os.write(buffer);
            os.write("\r\n".getBytes());
            byte[] bytes = "灰太狼爱喜羊羊".getBytes();
            os.write(bytes);
            os.write("\r\n".getBytes());

            // os.flush();  // 刷新后流还能用
            // os.close(); // 关闭流 释放资源，包含刷新
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
