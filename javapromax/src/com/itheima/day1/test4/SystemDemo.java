package com.itheima.day1.test4;

public class SystemDemo {
    public static void main(String[] args)throws Exception {
       Runtime r = Runtime.getRuntime();
        System.out.println(r.availableProcessors());
        System.out.println(r.totalMemory()/1024.0/1024 + "MB");
        System.out.println(r.freeMemory()/1024/1024 + "MB");
        r.exec("D:\\entertianment\\wechat\\WeChat.exe");

    }

}
