package itheima.demo6;

import java.util.*;

public class MyLinkedList<E> {
    private static Scanner sc = new Scanner(System.in);
    private int size;
    private Node<E> head;

    static class Node<E> {
        E val;
        Node<E> next;

        public Node(E val, Node<E> next) {
            this.val = val;
            this.next = next;
        }
    }

    public void sort() {
        Node<E> temp = head;
        List<E> list = new ArrayList<>();
        while (temp!=null){
            list.add(temp.val);
            temp =temp.next;
        }


       list.sort(Comparator.comparingInt(Object::hashCode));
        head =null;
        for (E e : list) {
            add(e);
        }


    }
    public void deleteDuplicate() {
        Node<E> temp = head;
        HashMap<E, Integer> map = new HashMap<>();
        while (temp!=null){
            if (map.keySet().contains(temp.val)){
                map.put(temp.val,map.get(temp.val) + 1);
            }else {
            map.put(temp.val,1);
            }
            temp =temp.next;
        }
        head =null;
        Set<E> set = map.keySet();
        for (E e : set) {
            if (map.get(e) == 1){
                add(e);
            }
        }


    }

    public E deleteAtIndex(int index) {
        Node<E> temp = head;
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            E e = temp.val;
            head = temp.next;
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

    public boolean add(E e) {
        if (head == null) {
            head = new Node(e, null);
            size++;
        } else {
            Node<E> temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = new Node(e, null);
            size++;
        }

        return true;
    }

    public void forEach(MyConsumer action) {
        Objects.requireNonNull(action);
        Node<E> temp = head;
        while (temp != null) {
            action.accept(temp.val);
            temp = temp.next;
        }
    }
}

interface MyConsumer<E> {
    void accept(E e);
}