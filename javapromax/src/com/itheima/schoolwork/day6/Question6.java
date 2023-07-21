package com.itheima.schoolwork.day6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  模拟注册用户,如果存在要注册的用户,直接显示"对不起,您注册的用户已经存在!请直接登录!",可以继续注册;
 *  如果不存在要注册的用户,显示"注册成功!",并将所有用户的信息显示出来!
 */
public class Question6 {
    private static ArrayList<User> users = new ArrayList<>();
    public static void main(String[] args) {
        users.add(new User("小明","123"));
        users.add(new User("小红","456"));
        users.add(new User("小勇","789"));
        System.out.println("请输入要注册的用户名");
        Scanner sc = new Scanner(System.in);
        while (true){
            String name = sc.next();
            if (checkName(name)){
                System.out.println("对不起,您注册的用户已经存在!请直接登录!");
                break;
            }else {
                System.out.println("请录入要注册的密码");
                String passWord = sc.next();
                users.add(new User(name,passWord));
                break;
            }
        }
        for (User user : users){
            System.out.println(user);
        }

    }
    public static boolean checkName (String name){
        for (User user : users) {
            if (user.getName().contains(name))return true;
        }
        return false;
    }
}
class User{
    private String name;
    private String passWord;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public User() {
    }

    public User(String name, String passWord) {
        this.name = name;
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}