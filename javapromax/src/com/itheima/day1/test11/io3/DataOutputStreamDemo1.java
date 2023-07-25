package com.itheima.day1.test11.io3;

import java.io.DataOutputStream;

import java.io.FileOutputStream;

public class DataOutputStreamDemo1 {
    public static void main(String[] args) {
        try (
                DataOutputStream dos =
                        new DataOutputStream(new FileOutputStream("D:\\projetforlearn\\code\\huangpu2\\javapromax\\src\\com\\itheima\\day1\\note.txt"));

        ){

        dos.writeUTF("萨达");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
