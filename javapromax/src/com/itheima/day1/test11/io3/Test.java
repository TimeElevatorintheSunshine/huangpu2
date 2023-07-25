package com.itheima.day1.test11.io3;



import java.io.BufferedWriter;
import java.io.FileOutputStream;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;


public class Test {
    public static void main(String[] args) {
        try(
              OutputStream os= new FileOutputStream("D:\\projetforlearn\\code\\huangpu2\\javapromax\\src\\com\\itheima\\day1\\note.txt");
              OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
              BufferedWriter bw = new BufferedWriter(osw);
        ) {

             bw.write("我爱你中国abc");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
