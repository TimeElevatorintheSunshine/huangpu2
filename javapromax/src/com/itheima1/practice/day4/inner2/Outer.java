package com.itheima1.practice.day4.inner2;

public class Outer {
    private int age;
    public static String id;
    public void test(){}
    public static void test1(){}
        // 静态内部类：有static修饰，外部类自己持有的
   public static class Inner{
            private String name;
            //  public static String schoolName = "黑马"; JDK 16支持

            public Inner(String name) {
                this.name = name;
            }
            public void show(){
                 //    System.out.println(age);
                System.out.println(id);
                test1();
                // test();
            }
            public Inner() {
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

