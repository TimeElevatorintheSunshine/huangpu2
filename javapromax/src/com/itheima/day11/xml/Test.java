package com.itheima.day11.xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Test {
    public static void main(String[] args)throws Exception {
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read("src/com/itheima/day11/xml/uesr.xml");

        Element rootElement = read.getRootElement();
        List<Element> elements = rootElement.elements("contact");

        for (Element element : elements) {
            System.out.println("id:" + element.attributeValue("id"));
            System.out.println("姓名:" + element.elementTextTrim("name"));
            System.out.println("性别:" + element.elementTextTrim("gender"));
            System.out.println("邮箱:" + element.elementTextTrim("email"));
        }
    }
}
