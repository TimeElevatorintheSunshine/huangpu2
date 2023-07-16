package com.itheima.day2.extends1;
// 父类
public class A {
    public int i;
    public void print(){
        System.out.println("=====print=====");
    }
    private int j;
    private void print1(){
        System.out.println("=====print1=====");
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
