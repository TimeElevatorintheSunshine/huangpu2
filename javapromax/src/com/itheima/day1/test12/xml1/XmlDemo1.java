package com.itheima.day1.test12.xml1;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


import java.io.InputStream;
import java.util.List;

public class XmlDemo1 {
    public static void main(String[] args)throws  Exception {
        SAXReader saxReader = new SAXReader();
     //  Document read = saxReader.read("src/com/itheima/day1/test12/xml1/hello_world.xml");

        InputStream is
                = XmlDemo1.class.getResourceAsStream("/com/itheima2/hello_world.xml");

        Document document
                = saxReader.read(is);
        Element r = document.getRootElement();
        System.out.println(r.getName());

        List<Element> elements = r.elements();
          // elements.get(0).attributeValue(1).

        Element user = r.element("user");
        System.out.println(user.elementText("address"));
        System.out.println(user.attributeValue("id"));
        for (Element element : elements) {
            System.out.println(element.attributeValue("id"));

        }
        System.out.println(elements.get(1).elementText("password"));
    }
}
