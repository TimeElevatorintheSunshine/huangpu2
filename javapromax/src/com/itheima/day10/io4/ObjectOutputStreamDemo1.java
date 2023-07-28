package com.itheima.day10.io4;

import com.itheima.day1.test11.io4.User;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo1 {
    public static void main(String[] args) {
        try (
                ObjectOutputStream oos =
                        new ObjectOutputStream(new FileOutputStream("src/com/itheima/day10/note.txt"));

        ) {
            User user = new User("admin", "张三", 32, "123456");
            oos.writeObject(user);
            System.out.println("序列化成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
