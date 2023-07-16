package com.itheima.schoolwork.day2;

/**
 *  1.定义动物类:
 * 	属性:
 * 		年龄
 * 	行为:
 * 		喝水,吃东西(吃什么不确定)
 * 2.定义游泳接口:
 * 	行为:
 * 		游泳方法swimming
 * 3.定义狗类:
 * 	行为:
 * 		吃饭(啃骨头)和 游泳(狗刨)
 * 4.定义羊类:sheep
 * 	行为:
 * 		吃饭(羊啃草)
 * 5.定义青蛙类:frog
 * 	行为:
 * 		吃饭(吃虫子)和 游泳(蛙泳)
 * 6.定义饲养员类:breeder
 * 	行为:
 * 		饲养动物breed:包括吃饭和喝水
 * 7.定义测试类:
 * 	创建饲养员对象,饲养员调用三次饲养方法:饲养狗,饲养羊,饲养青蛙
 */
public class Question {
    public static void main(String[] args) {
        Breeder breeder = new Breeder();
        Dog dog = new Dog();
        breeder.breed(dog);
        dog.swimming();
        frog frog = new frog();
        breeder.breed(frog);
        frog.swimming();
        Sheep sheep = new Sheep();
        breeder.breed(sheep);
    }
}
class Breeder{
    public void breed(Animal a){
        a.drink();
        a.eat();
    }
}
class frog extends Animal implements Swimming{

    @Override
    public void swimming() {
        System.out.println("🐸🏊‍");
    }

    @Override
    void eat() {
        System.out.println("🐸🐛");
    }
}
class Sheep extends Animal{

    @Override
    void eat() {
        System.out.println("🐏🌿");
    }
}
class Dog extends Animal implements Swimming{

    @Override
    public void swimming() {
        System.out.println("🐕🏊‍");
    }

    @Override
    void eat() {
        System.out.println("🐕🦴");
    }
}
interface Swimming{
    void swimming();
}
abstract class Animal{
    private int age;
    abstract void eat();
    void drink(){
        System.out.println("🥂💧");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}