package com.itheima.exam.exam5;

import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<Object> s = new MyLinkedList<>();
        MyLinkedList.Node<Object> node = s.add();
        s.forEach(s.reverse(node,2,5));

    }
}
