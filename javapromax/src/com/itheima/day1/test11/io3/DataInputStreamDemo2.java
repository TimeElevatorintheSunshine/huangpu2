package com.itheima.day1.test11.io3;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataInputStreamDemo2 {
    public static void main(String[] args) {
        try (
                DataInputStream ds =
                        new DataInputStream(new FileInputStream("D:\\projetforlearn\\code\\huangpu2\\javapromax\\src\\com\\itheima\\day1\\note.txt"));

        ){
//            ds.read();
//
//            ds.readInt();
//             ds.readByte();
//               ds.readBoolean();
            String read = ds.readUTF();
            System.out.println(read);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
