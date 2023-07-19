package com.itheima.exam.exam10;

import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args)  {
        MyLinkedList<String> s = new MyLinkedList<>();
        MyLinkedList.Node<String> add = s.add();
        s.reverse(add,1,5);
        s.forEach(add);
    }
}
