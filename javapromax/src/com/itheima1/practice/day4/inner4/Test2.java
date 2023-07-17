package com.itheima1.practice.day4.inner4;

public class Test2 {
    public static void main(String[] args) {
        // 匿名内部类使用场景
       Swimming s = new Swimming(){
            @Override
            public void swim() {
                System.out.println("🐕🏊‍");
            }
        };
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
       go(()->System.out.println("🐱🏊‍"));
       go(s);

    }
    public static void go(Swimming s){
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }

}

interface Swimming{
    void swim();
}