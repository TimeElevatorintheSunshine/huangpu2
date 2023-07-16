package com.itheima.exam.exam5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MyLinkedList<E> {
    private int size;

    public static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    public Node<E> reverse(Node<E> head, int left, int right) {
        if (head == null || left < 1 || left > size || right < 1 || right > size || right == left || left > right) {
            return head;
        }
        Node<E> first = head;
        int index = 0;
        Node<E> mark = null;
        List<E> list = new ArrayList<>();
        while (head != null) {
            index++;
            if (index == left) mark = head;
            if (index >= left && index <= right) list.add(head.data);
            if (index == right) break;

            head = head.next;
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            E e = list.get(i);
            mark.data = e;
            mark = mark.next;
        }


        return first;
    }

    public Node<E> add() {
        Node<E> head = null;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入结点下一个数据");
            String data = sc.next();
            if (data.equals("exit")) break;
            if (head == null) {
                head = new Node(data, null);
                size++;
            } else {
                Node<E> temp = head;
                while (temp.next != null) temp = temp.next;
                temp.next = new Node(data, null);
                size++;
            }
        }
        return head;
    }

    public void forEach(Node<E> head) {
        if (head == null) {
            System.out.println(head);
            return;
        }
        while (head != null) {
            System.out.print(head.data + "\t");
            head = head.next;
        }
    }
}
