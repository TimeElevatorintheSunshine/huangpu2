package com.itheima.day1.test11;



import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;


public class FileInputStream2 {
    public static void main(String[] args) throws Exception {

        FileInputStream f = new FileInputStream("javapromax\\src\\com\\itheima\\day1\\note.txt");

        // 每次读取多个字节到数组中去，返回读取的字节数量，读取完毕会返回-1
        byte[] buffer = new byte[9];
        int len = f.read(buffer);
        String rs = new String(buffer);
        System.out.println(len);
        System.out.println(rs);

        // 读取多少倒出多少
        int len1 = f.read(buffer);
        String rs1 = new String(buffer,0,2);
        System.out.println(len1);
        System.out.println(rs1);

        int len3 = f.read(buffer);
        System.out.println(len3);



        f.close();
    }
}
