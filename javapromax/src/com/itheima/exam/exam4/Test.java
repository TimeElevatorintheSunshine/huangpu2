package com.itheima.exam.exam4;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<String> s = new MyLinkedList<>();
        MyLinkedList.Node<String> add = s.add();
        s.forEach(add);
        s.forEach(s.reverse(add,1,5));
    }
}
