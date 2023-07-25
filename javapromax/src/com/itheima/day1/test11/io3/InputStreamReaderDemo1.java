package com.itheima.day1.test11.io3;


import java.io.*;

public class InputStreamReaderDemo1 {
    public static void main(String[] args) {
        try(
              InputStream is = new FileInputStream("D:\\projetforlearn\\code\\huangpu2\\javapromax\\src\\com\\itheima\\day1\\notecopy");
              Reader isr = new InputStreamReader(is,"UTF-8");
               BufferedReader br = new BufferedReader(isr);
        ) {
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
