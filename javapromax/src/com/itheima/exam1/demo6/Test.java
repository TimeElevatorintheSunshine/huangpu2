package com.itheima.exam1.demo6;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<Integer> l = new MyLinkedList<>();
        l.add(2);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(5);
        l.add(5);
        l.add(5);
        l.add(5);
       // l.deleteAtIndex(0);
      //  l.deleteAtIndex(3);
        l.sort();
        l.deleteDuplicate();
        l.forEach();
        System.out.println(l.size());
    }
}
