package com.itheima.day1.test12.xml1;

import org.apache.commons.io.IOUtils;

import java.io.*;

/**
 * 目标：如何使用程序把数据写出到 XML文件中去。
 * <?xml version="1.0" encoding="UTF-8" ?>
 * <book>
 *     <name>从入门到跑路</name>
 *     <author>dlei</author>
 *     <price>999.9</price>
 * </book>
 */

public class XmlDemo2 {
    public static void main(String[] args) {
        StringBuilder sb
                = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n")
                .append("<book>\r\n")
                .append("\t<name>").append("从入门到跑路").append("</name>\r\n")
                .append("\t<author>").append("dlei").append("</author>\r\n")
                .append("\t<price>").append(999.9).append("</price>\r\n")
                .append("</book>");

        try (
                BufferedWriter bw
                        = new BufferedWriter(new FileWriter("src/com/itheima/day1/test12/xml1/hello_world1.xml"))
        ){
         bw.write(sb.toString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
