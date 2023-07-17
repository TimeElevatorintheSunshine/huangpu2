package com.itheima.schoolwork.day3;



public class Test {
    public static void main(String[] args) {
        // 在此处完成代码
        A a = new A();
        a.methodA(new InterA() {
            @Override
            public void showA() {
                System.out.println("我是没有名字的InterA的实现类");
            }
        });
        a.methodA(a);
    }
}
//定义接口
interface InterA {
    void showA();
}
class A implements InterA{
    public void methodA(InterA a) {
        a.showA();
    }

    @Override
    public void showA() {
        System.out.println("我是有名字的InterA的实现类");
    }
}