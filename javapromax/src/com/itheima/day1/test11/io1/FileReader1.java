package com.itheima.day1.test11.io1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader1 {
    public static void main(String[] args) throws Exception {


        try (
                FileReader fr = new FileReader("javapromax\\src\\com\\itheima\\day1\\note.txt");
                ){
           char[] buffer = new char[9];
            int len;
            while ((len= fr.read(buffer))!=-1){
                String rs = new String(buffer);
                System.out.println(rs);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
