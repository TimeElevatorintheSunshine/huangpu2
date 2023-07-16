package com.itheima.day2.extends3;

public class Fu {
    // private 只能本类中
    private void privateMethod(){
        System.out.println("=========privateMethod=====");
    }

    // 缺省 本类中，同一个包下的其他类中
    void method(){
        System.out.println("=========method=====");
    }

    //protected 本类中，同一个包下的其他类，其他包的子类中
    protected void protectedMethod(){
        System.out.println("=========protectedMethod=====");
    }
    //public 任意类中
    public void publicMethod(){
        System.out.println("=========publicMethod=====");
    }
}
