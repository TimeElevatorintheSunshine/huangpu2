package com.itheima.exam1.demo6;


import java.util.*;

public class MyLinkedList<E extends Comparable> {
    private Node<E> head;
    private int size;

    private static class Node<E> {
        E val;
        Node<E> next;

        public Node(E val, Node<E> next) {
            this.val = val;
            this.next = next;
        }
    }

    //    public void deleteDuplicate() {
//        Node<E> temp = head;
//        HashMap<E, Integer> map = new HashMap<>();
//        while (temp != null) {
//            map.put(temp.val, map.containsKey(temp.val) ? map.get(temp.val) + 1 : 1);
//            temp = temp.next;
//        }
//        head = null;
//        Set<E> set = map.keySet();
//        for (E e : set) {
//            if (map.get(e) == 1) {
//                add(e);
//            }
//        }
//    }
    public void deleteDuplicate() {
        deleteDuplicate(head);
    }

    public void deleteDuplicate(Node<E> head) {
//        if (head == null || head.next == null){
//            return head;
//        }
        if (head == null){
            return;
        }
        Node<E> temp = head;

        Node<E> temp1 = head.next;

        if (temp.val != temp1.val){
            deleteDuplicate(temp1);
        }else {
       while (temp.val == temp1.val){
             temp.next = temp1.next;
            temp1  = temp1.next;

            if (temp1 == null){
                break;
            }
       }if (temp1 ==null){
                temp = temp1;
            }else {
            temp = temp1.next;}
        deleteDuplicate(temp1);
        }

    }


    public void sort() {
        Node<E> temp = head;
        // List<E> list = new ArrayList<>();
        int index = 0;
        Object[] arr = new Object[size];
        while (temp != null) {
            // list.add(temp.val);
            arr[index++] = temp.val;
            temp = temp.next;
        }
        // list.sort(Comparator.comparingInt(Object::hashCode));
        // head =null;
        Arrays.sort(arr);
        Node<E> temp1 = head;
        for (int i = 0; i < arr.length; i++) {
            temp1.val = (E) arr[i];
            temp1 = temp1.next;
        }


//        for (E e : list) {
//            add(e);
//        }

    }

    public E deleteAtIndex(int index) {
        Node<E> temp = head;

        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            E e = temp.val;
            head = temp.next;
            --size;
            return e;
        }
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node<E> temp1 = temp.next;
        E e = temp1.val;
        temp.next = temp1.next;
        --size;
        return e;
    }

    public int size() {
        return size;
    }

    public boolean add(E e) {
        Node<E> node = new Node<>(e, null);
        if (head == null) {
            head = node;
            size++;
        } else {
            Node<E> temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = node;
            size++;
        }
        return true;
    }

    public void forEach() {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        Node<E> temp = head;
        while (temp != null) {
            sj.add("" + temp.val);
            temp = temp.next;
        }
        System.out.println(sj);
    }

}
