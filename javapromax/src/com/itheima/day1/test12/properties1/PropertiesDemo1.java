package com.itheima.day1.test12.properties1;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo1 {
    public static void main(String[] args) {
        try (Writer is = new FileWriter("src/com/itheima/day1/test12/properties1/Uesr.properties");

        ) {
            Properties p = new Properties();
            p.setProperty("adimin","123456");
            p.setProperty("wj","mm");
            p.setProperty("zm","wj");

            p.store(is,"many users");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
