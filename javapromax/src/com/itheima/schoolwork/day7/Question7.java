package com.itheima.schoolwork.day7;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Question7 {
  private static   Set<User> users = new HashSet<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        out:
        while (true){
            System.out.println("请输入用户名");
            String name = sc.next();
            if (name.equals("exit"))break;
            System.out.println("请输入密码");
            String passWord = sc.next();
            User user = new User(name, passWord);
            if(users.add(user)){
                System.out.println("注册成功...");
                System.out.println("当前的用户有："+ users);
            }else{
                System.out.println("注册失败...");
            }

        }


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
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