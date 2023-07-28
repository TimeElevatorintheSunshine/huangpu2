package com.itheima.day11.properties;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) throws Exception{



        try (
                FileInputStream is = new FileInputStream("src/com/itheima/day11/properties/users.properties")
        ){
           Properties properties = new Properties();
            properties.load(is);
            System.out.println(properties);
            properties.setProperty("赵六","98763");
            properties.store(new FileWriter("src/com/itheima/day11/properties/users.properties"),"2023-07-28");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
