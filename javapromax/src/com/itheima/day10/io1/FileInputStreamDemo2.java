package com.itheima.day10.io1;

import java.io.FileInputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) {
        try (
                // 创建文件字节输入流管道与源文件接通
                FileInputStream is
                        = new FileInputStream("src/com/itheima/day10/note1.txt");
        ){
        // 每次读取一个字节数组
            byte[] buffer = new byte[3];
//            int len = is.read(buffer);
//            System.out.println("读取了多少个字节:" + len);
//            String s = new String(buffer);
//            System.out.println("读取的内容:" + s);
//
//            int len1 = is.read(buffer);
//            System.out.println("读取了多少个字节:" + len1);
//            // String s1 = new String(buffer);
//            String s1 = new String(buffer,0,len1);
//            System.out.println("读取的内容:" + s1);

            // 使用循环改进

            int len;
            while ((len = is.read(buffer)) != -1){
                String s = new String(buffer, 0, len); // 读取多少倒出多少
                System.out.print(s);

                // 性能得到提升，但是无法避免读取汉字还是会乱码
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
