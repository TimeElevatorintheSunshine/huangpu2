package com.itheima.day4.enum1;

public class Test {
    public static void main(String[] args) {
        // javap 反编译（cmd）
        A a = A.X;
        a.setName("dlei");
        a.show();
        // 提取全部枚举对象
        A[] objects = A.values();
        for (int i = 0; i < objects.length; i++) {
            A object = objects[i];
            System.out.println(object);
        }

        // 提取单个对象
        A y = A.Y;
        A y1 = A.valueOf("Y");
        System.out.println(y == y1);
    }
}
enum C{
    // 第一行罗列的对象必须时具体的对象
    X(){
        @Override
        public void run() {

        }
    };
    // 枚举类一旦有了抽象方法，这个枚举就是抽象枚举
    public abstract void run();
}
enum B{
    // 单例设计模式
    X;
}
enum A {
    //枚举类中的第一行，只能写一些合法的标识符(名称)，多个名称用逗号隔开。
    X, Y, Z;
    private String name;

    public void show() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}