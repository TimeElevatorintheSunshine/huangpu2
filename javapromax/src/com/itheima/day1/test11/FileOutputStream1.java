package com.itheima.day1.test11;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStream1 {
    public static void main(String[] args)throws Exception {
        OutputStream f = new FileOutputStream("javapromax\\src\\com\\itheima\\day1\\note.txt");
        f.write('a');
        byte[] buffer = {'a','s','s'};
        f.write(buffer);
        f.close();
    }
}
