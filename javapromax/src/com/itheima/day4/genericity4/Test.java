package com.itheima.day4.genericity4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 掌握通配符（?）上下限的知识
        // 开发极品飞车的游戏
        // 虽然BMW和BENZ时Car 的子类，但是他们的集合没有关系
 // 泛型上限:  ? extends Car:  ? 能接收的必须是Car或者其子类
//  泛型下限： ? super Car ： ? 能接收的必须是Car或者其父类
        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);
        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        go(benzs);
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
      //  go(dogs);
    }
    public static void go(ArrayList<? extends Car> cars){

    }
}
class Dog{}
class BENZ extends Car{

}
class BMW extends Car{

}
class Car{

}