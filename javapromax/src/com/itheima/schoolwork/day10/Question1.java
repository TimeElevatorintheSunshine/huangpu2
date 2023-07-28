package com.itheima.schoolwork.day10;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question1 {
    public static void main(String[] args) throws Exception{
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read(Question1.class.getResourceAsStream("/hello_world.xml"));

        Element rootElement = read.getRootElement();

        List<Element> elements = rootElement.elements("user");
        Map<Integer, User> users = new HashMap<>();
        for (Element element : elements) {
            User user = new User();
            user.setName(element.elementText("name"));
            user.setSex(element.elementText("sex"));
            user.setLocal(element.elementText("地址"));
            user.setPassWord(element.elementText("password"));
            users.put(Integer.parseInt(element.attributeValue("id")),user);
        }
        Set<Map.Entry<Integer, User>> entries = users.entrySet();
        for (Map.Entry<Integer, User> entry : entries) {
            System.out.println("编号:" + entry.getKey() +"号,信息如下:\r\n"+ entry.getValue().toString());
        }


    }
}
class User{
    private String name;
    private String sex;
    private String local;
    private String passWord;

    @Override
    public String toString() {
        return
                "名字:" + name  +
                "\r\n性别:" + sex  +
                "\r\n地址:" + local  +
                "\r\n密码:" + passWord
                ;
    }

    public User() {
    }

    public User(String name, String sex, String local, String passWord) {
        this.name = name;
        this.sex = sex;
        this.local = local;
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}