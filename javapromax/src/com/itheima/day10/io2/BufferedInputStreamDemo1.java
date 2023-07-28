package com.itheima.day10.io2;

import java.io.*;

public class BufferedInputStreamDemo1 {
    public static void main(String[] args) {
        try(
             InputStream
                        is = new FileInputStream("C:\\Users\\m1343\\Desktop\\Document\\aaa.png");
             InputStream bis = new BufferedInputStream(is);

            OutputStream os
                     = new FileOutputStream("C:\\Users\\m1343\\Desktop\\Document\\aaa1.png");
                OutputStream bos = new BufferedOutputStream(os);
        )
        {
            byte[] bytes = new byte[1024];
            int len;
              while ((len = bis.read(bytes) ) != -1){
                  bos.write(bytes,0,len);
              }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
