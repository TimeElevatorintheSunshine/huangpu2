package com.itheima.day1.test11.io4;



import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo1 {
    public static void main(String[] args) {


        try (
                ObjectOutputStream oos =
                        new ObjectOutputStream(new FileOutputStream("D:\\projetforlearn\\code\\huangpu2\\javapromax\\src\\com\\itheima\\day1\\note.txt"));

        ) {
            User user = new User("admin", "张三", 32, "123456");
            oos.writeObject(user);
            System.out.println("序列化成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

