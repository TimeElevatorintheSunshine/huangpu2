package com.itheima.day1.test11;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;


public class FileInputStream3 {
    public static void main(String[] args) throws Exception {
        FileInputStream f = new FileInputStream("javapromax\\src\\com\\itheima\\day1\\note.txt");

        byte[] bytes = Files.readAllBytes(Paths.get("javapromax\\src\\com\\itheima\\day1\\note.txt"));
        int read = f.read(bytes);
        String rs = new String(bytes);
        System.out.println(read);
        System.out.println(rs);
        f.close();

    }
}
