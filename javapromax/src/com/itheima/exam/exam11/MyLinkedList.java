package com.itheima.exam.exam11;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Objects;

public class MyLinkedList<E> {
    private int size;
    private Node<E> first;
    private Node<E> last;

    public static void main(String[] args) {
        MyLinkedList<String> s = new MyLinkedList<>();
        s.add("a");
        s.removeFirst();
        s.forEach(System.out::println);
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

//    public E remove(int index) {
//
//    }

    public E removeLast() {
        Node<E> l = last;
        if (l == null) throw new NoSuchElementException();
        return unLinkLast(l);
    }

    public E removeFirst() {
        Node<E> f = first;
        if (f == null) throw new NoSuchElementException();
        return unLinkFirst(f);
    }

    E unLink(Node<E> x) {
        E element = x.item;
        Node<E> next = x.next;
        Node<E> prev = x.prev;

        if (next ==null){
            last = prev;
        } else{
            next.prev = prev;
            x.next =null;
        }
        if (prev == null){
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }
        x.item = null;
        size--;
        return element;
    }

    private E unLinkLast(Node<E> l) {
        E element = l.item;
        Node<E> prev = l.prev;
        l.item = null;
        l.prev = null;
        last = prev;
        if (prev == null)
            first = null;
        else
            prev.next = null;
        size--;
        return element;
    }

    private E unLinkFirst(Node<E> f) {
        E element = f.item;
        Node<E> next = f.next;
        f.item = null;
        f.next = null;
        first = next;
        if (next == null)
            last = null;
        else
            next.prev = null;
        size--;
        return element;
    }

    /**
     * 增加
     */
    public void addFirst(E e) {
        linkFirst(e);
    }

    public void addLast(E e) {
        linkLast(e);
    }

    public void push(E e) {
        addFirst(e);
    }

    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    private void linkLast(E e) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null) first = newNode;
        else l.next = newNode;
        size++;
    }

    private void linkFirst(E e) {
        Node<E> l = first;
        Node<E> newNode = new Node<>(null, e, l);
        first = newNode;
        if (l == null) last = newNode;
        else l.prev = newNode;
        size++;
    }

    /**
     * 遍历
     */
    public void forEach(MyConsumer consumer) {
        Objects.requireNonNull(consumer);
        while (first != null) {
            E item = first.item;
            consumer.accept(first.item);
            first = first.next;
        }

    }
}
