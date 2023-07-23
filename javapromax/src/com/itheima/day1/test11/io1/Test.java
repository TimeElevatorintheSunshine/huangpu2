package com.itheima.day1.test11.io1;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args)throws Exception{
        // 文件复制
        byte[] buffer = Files.readAllBytes(Paths.get("javapromax\\src\\com\\itheima\\day1\\note.txt"));
        FileOutputStream out = new FileOutputStream("javapromax\\src\\com\\itheima\\day1\\notecopy");
        out.write(buffer);
        out.close();

    }
}
