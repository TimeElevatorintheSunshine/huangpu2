package com.itheima.day4.inner1;

public class Test {
    public static void main(String[] args) {
        // 掌握成员内部类的语法知识
        //  外部类名.内部类名 对象名 = new 外部类(...).new 内部类(...);
        Outer.Inner inner = new Outer().new Inner();
        inner.setName("内部名称");
    }
}
class Outer{
    private int age;
    public static String id;
public void test(){}
    // 成员内部类：无static修饰，属于类的对象
    public class Inner{
        // 类有的成员他都有
        private String name;
      //  public static String schoolName = "黑马"; JDK 16支持

        public Inner(String name) {
            this.name = name;
        }
    public void show(){
        //可以直接访问外部类的实例成员、静态成员
        System.out.println(age);
        test();
        System.out.println(id);

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