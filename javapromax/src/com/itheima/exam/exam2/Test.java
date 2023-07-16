package com.itheima.exam.exam2;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<String> s = new MyLinkedList<>();
        MyLinkedList.Node<String> head = s.add();
        s.forEach(head);
        s.forEach(s.reverse(head, 1, 5));

    }
}
