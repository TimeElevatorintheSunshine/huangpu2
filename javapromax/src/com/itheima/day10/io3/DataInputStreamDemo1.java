package com.itheima.day10.io3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputStreamDemo1 {
    public static void main(String[] args) {

        try (
                DataOutputStream dos
                        = new DataOutputStream(new FileOutputStream("src/com/itheima/day10/none.txt"));
                DataInputStream dis
                       = new DataInputStream(new FileInputStream("src/com/itheima/day10/note.txt"));
        ){

            dos.writeInt(97);
            dos.writeUTF("伟大的");

            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
