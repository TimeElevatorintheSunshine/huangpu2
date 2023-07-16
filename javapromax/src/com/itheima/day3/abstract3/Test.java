package com.itheima.day3.abstract3;

public class Test {
    public static void main(String[] args) {
        // 模板方式设计模式
        People a = new Student();
        a.write();
        People b = new Teacher();
        b.write();
    }
}
