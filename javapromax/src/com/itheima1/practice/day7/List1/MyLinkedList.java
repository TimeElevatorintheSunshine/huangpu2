package com.itheima1.practice.day7.List1;

import java.util.StringJoiner;

public class MyLinkedList<E> {
private Node<E> head;

    public static void main(String[] args) {
        MyLinkedList<String> s = new MyLinkedList<>();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        System.out.println(s);
    }
    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(",","[","]");
        Node<E> temp =head;
        while (head != null){
            sj.add(head.item + "");
            head = head.next;
        }
        return sj.toString();
    }

    public boolean add(E e){
        Node<E> temp = head;
        Node<E> node = new Node<>(e,null);
        if (temp == null){
            head = node;
        }else {
            while (temp != null){
                if (temp.next == null){
                    temp.next =node;
                    break;
                }
                temp = temp.next;
            }

        }
        return true;
    }
    private static class Node<E> {
        E item;
      Node<E> next;

        public Node() {
        }

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }
}
