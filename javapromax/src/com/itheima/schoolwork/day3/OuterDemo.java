package com.itheima.schoolwork.day3;

interface Inter {
    void show();
}

class Outer {
    public static Inter method() {

        return new Inter() {
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }

    //补齐代码，要求在控制台输出”HelloWorld”
    class A implements Inter {

        @Override
        public void show() {

        }
    }
}


public class OuterDemo {
    public static void main(String[] args) {

        Outer.method().show();
    }
}