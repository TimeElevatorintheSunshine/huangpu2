package com.itheima.day10.io3;

import java.io.*;

public class InputStreamReaderDemo1 {
    public static void main(String[] args) {
        try(
                InputStreamReader isr
                        = new InputStreamReader(new FileInputStream("src/com/itheima/day10/note.txt"));
                BufferedReader br = new BufferedReader(isr);
                BufferedWriter bw
                        = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/com/itheima/day10/note1.txt"),"GBK"))
        )
        {
           String len;
            while ((len = br.readLine() ) != null){
                bw.write(len);
                bw.newLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
