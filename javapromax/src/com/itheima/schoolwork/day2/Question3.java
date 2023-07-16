package com.itheima.schoolwork.day2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * **训练目标**：掌握Java中抽象类以及继承的使用，以及理解其在开发中的应用
 * **需求背景**：在现在的互联网系统中大部分的网站都是支持手机号码登录的，
 * 当用户输入完手机号码点击获取短信验证码此时就会访问一些短信平台，由短信平台(阿里云短信平台、腾讯云短信平台)
 * 给用户的手机号码上发送一个短信验证码！如下图所示：
 */
public class Question3 {
    public static void main(String[] args) {
        System.out.print("请您输入登录的手机号码");
        Scanner sc = new Scanner(System.in);
         String number = sc.next();
        AliyunSendMsg aliyunSendMsg = new AliyunSendMsg();
        aliyunSendMsg.createCode(number);


        System.out.print("请您输入登录的手机号码");
        String number1 = sc.next();
        TencentSendMsg tencentSendMsg = new TencentSendMsg();
        tencentSendMsg.createCode(number);



    }
}
class CheckCode{
    private String phone;
    private String code;

    public CheckCode() {
    }

    public CheckCode(String phone, String code) {
        this.phone = phone;
        this.code = code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
class TencentSendMsg extends Sendcode{

    @Override
    void send(String number, String code) {
        System.out.println("访问腾讯云短信平台给" + number + "发送短信验证码" + code);
    }
}
class AliyunSendMsg extends Sendcode{

    @Override
    void send(String number,String code) {
        System.out.println("访问阿里云短信平台给" + number + "发送短信验证码" + code);
    }
}
abstract class Sendcode{
    private  ArrayList<CheckCode> list  = new ArrayList<>();

    public void createCode(String number) {
        String code = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            code += r.nextInt(10);
        }
        send(number,code);
        list.add(new CheckCode(number,code));
    }

    abstract void send(String number,String code);
}