package com.itheima.day1.test11.io1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStream1 {


    public static void main(String[] args) throws Exception {

       // InputStream f = new FileInputStream(new File("javapromax\\src\\com\\itheima\\day1\\note.txt"));
        InputStream f = new FileInputStream("javapromax\\src\\com\\itheima\\day1\\note.txt");
        /*int b1 = f.read();
        System.out.println((char)b1);
        int b2 = f.read();
        System.out.println((char)b2);
        int b3 = f.read();
        System.out.println(b3);*/
        int b;
        while ((b =f.read())!=-1){
            System.out.println((char)b);
        }

      //  f.read();

    f.close();
    }
}
