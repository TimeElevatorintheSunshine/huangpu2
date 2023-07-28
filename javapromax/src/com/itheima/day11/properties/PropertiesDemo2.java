package com.itheima.day11.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws Exception{

        Properties properties = new Properties();
        properties.load(new FileReader("D:\\projetforlearn\\heima\\Nwt\\徐磊\\day10-special-file-log\\src\\peoples.txt"));

        for (Object o : properties.keySet()) {
            if (o.equals("李芳")){
                properties.replace("李芳",properties.get("李芳"),"18");
            }
        }
        properties.store(new FileWriter("D:\\projetforlearn\\heima\\Nwt\\徐磊\\day10-special-file-log\\src\\peoples.txt"),"2023");

    }
}
