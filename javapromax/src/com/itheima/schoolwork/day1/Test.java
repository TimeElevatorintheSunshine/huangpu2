package com.itheima.schoolwork.day1;

public class Test {
    public static void main(String[] args) {
        new B();
    }
}
class C{
public C(){
    System.out.println("C构造");
}
}
class B extends A{
  static C c = new C();
   static {
       System.out.println("SB代");
   }
    {
        System.out.println("B代");
    }
    public B(){
        System.out.println("B构造");
    }
}
class A{
    static {
        System.out.println("SA代");
    }
    {
        System.out.println("A代");
    }
    public A(){
        System.out.println("A构造");
    }
}