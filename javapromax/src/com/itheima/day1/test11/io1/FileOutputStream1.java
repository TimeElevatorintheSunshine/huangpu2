package com.itheima.day1.test11.io1;

import java.io.*;

public class FileOutputStream1 {
    public static void main(String[] args) throws Exception {
//        OutputStream f = new FileOutputStream("javapromax\\src\\com\\itheima\\day1\\note.txt");
//        f.write('a');
//        byte[] buffer = {'a','s','s'};
//        f.write(buffer);
//        f.close();
        // 复制照片


        try (
                InputStream is = new FileInputStream("C:\\Users\\m1343\\Desktop\\Document\\191f190b01d5364db0b428c0141ecc75.png");
                OutputStream os = new FileOutputStream("D:\\projetforlearn\\heima\\基础加强14天课程\\day09-字符集、IO流（一）\\视频\\191f190b01d5364db0b428c0141ecc75.png");
            // 这里只能放置资源对象
                // 什么是资源，会实现 AutoCloseable 接口 资源都会有一个close方法，并且资源放到这里后
                //用完之后，会被自动调用close方法完成资源的释放操作
        ) {

            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
