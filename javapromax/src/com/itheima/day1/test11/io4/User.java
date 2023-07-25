package com.itheima.day1.test11.io4;

import java.io.Serializable;

public class User implements Serializable {
private String name;
private String userName;
private int age;
private transient String passWord;

@Override
public String toString() {
        return "User{" +
        "name='" + name + '\'' +
        ", userName='" + userName + '\'' +
        ", age=" + age +
        ", passWord='" + passWord + '\'' +
        '}';
        }

public User() {
        }

public User(String name, String userName, int age, String passWord) {
        this.name = name;
        this.userName = userName;
        this.age = age;
        this.passWord = passWord;
        }

public String getName() {
        return name;
        }

public void setName(String name) {
        this.name = name;
        }

public String getUserName() {
        return userName;
        }

public void setUserName(String userName) {
        this.userName = userName;
        }

public int getAge() {
        return age;
        }

public void setAge(int age) {
        this.age = age;
        }

public String getPassWord() {
        return passWord;
        }

public void setPassWord(String passWord) {
        this.passWord = passWord;
        }
        }