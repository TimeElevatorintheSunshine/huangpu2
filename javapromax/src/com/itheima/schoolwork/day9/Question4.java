package com.itheima.schoolwork.day9;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Question4 {
    static final int a = 7;
    public static void main(String[] args) throws  Exception{

            try (
                    BufferedInputStream is
                            = new BufferedInputStream(new FileInputStream("src/com/itheima/schoolwork/day9/note.txt"));
                    BufferedOutputStream os
                            = new BufferedOutputStream(new FileOutputStream("src/com/itheima/schoolwork/day9/note1.txt"));
            ){
                byte[] buffer = new byte[1024];
                int len;
                while ((len = is.read(buffer)) != -1){
                    for (int i = 0; i < buffer.length; i++) {
                        buffer[i] = (byte) (buffer[i] ^ a);
                    }
                    os.write(buffer,0,len);
                }

            }catch (Exception e){
                e.printStackTrace();
            }
    }
}
