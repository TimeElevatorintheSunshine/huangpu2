package com.itheima.day1.test11.io1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriter1 {
    public static void main(String[] args)throws Exception {
        try (
                FileReader fr = new FileReader("javapromax\\src\\com\\itheima\\day1\\note.txt");
                FileWriter fw = new FileWriter("javapromax\\src\\com\\itheima\\day1\\notecopy")

        ){
            char[] buffer = new char[100];
            int len;
            while ((len= fr.read(buffer))!=-1){
                fw.write(buffer,0,len);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
