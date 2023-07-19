package com.itheima1.practice.day6.lambda1;

public class LambdaDemo1 {
    public static void main(String[] args) {
        // 认识lambda
      /*  new Animal() {
            @Override
            public void run() {
                System.out.println("二狗子跑的贼快");
            }
        };  */


        // 只能简化函数式接口的匿名内部类

//        Swimming swimming = new Swimming() {
//            @Override
//            public void swimming() {
//                System.out.println("水上漂游得贼快");
//            }
//        };
        Swimming swimming = () -> System.out.println("水上漂游得贼快");

    }
}

interface Swimming{
    void swimming();
}
abstract class Animal{
    abstract public void run();
}