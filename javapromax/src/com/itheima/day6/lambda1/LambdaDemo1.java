package com.itheima.day6.lambda1;

public class LambdaDemo1 {
    public static void main(String[] args) {
        // 认识lambda
//        new Animal() {
//            @Override
//            public void run() {
//                System.out.println("跑的贼快");
//            }
//        };

        // 只能简化函数式接口的匿名内部类

//        new Swimming() {
//            @Override
//            public void swimming() {
//
//            }
//        };
        Swimming s = () -> System.out.println("跑的贼快");
            s.swimming();



    }
}


abstract class Animal{
    public abstract void run();
}
@FunctionalInterface
interface Swimming{
    void swimming();
}