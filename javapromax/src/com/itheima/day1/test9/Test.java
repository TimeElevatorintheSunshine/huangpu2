package com.itheima.day1.test9;

public class Test {
    public static void main(String[] args) {
       /* try {
            saveAge(160);
            System.out.println("saveAge底层执行是成功的！");
        } catch (AgeIllegalException e) {
            e.printStackTrace();
            System.out.println("saveAge底层执行是出现bug的！");
        }*/
        try {
            saveAge2(160);
            System.out.println("saveAge2底层执行是成功的！");
        } catch (AgeIllegalRuntimeException e) {
            e.printStackTrace();
            System.out.println("saveAge2底层执行是出现bug的！");
        }
    }
    public static void saveAge(int age)throws AgeIllegalException{
        if (age >0 && age <150){
            System.out.println("年龄成功保存" + age);
        }else {
            // 用一个异常对象封装这个问题
            // throw 抛出去这个异常对象
            // throws 用在方法上，抛出方法内部的异常
            throw new AgeIllegalException("age is illegal,you age is" + age);
        }
    }
    public static void saveAge2(int age){
        if (age >0 && age <150){
            System.out.println("年龄成功保存" + age);
        }else {
            // 用一个异常对象封装这个问题
            // throw 抛出去这个异常对象
            throw new AgeIllegalRuntimeException("age is illegal,you age is" + age);
        }
    }
}
