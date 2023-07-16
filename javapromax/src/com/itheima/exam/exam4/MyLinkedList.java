package com.itheima.exam.exam4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MyLinkedList<E>{
  private int size;
   public static class Node<E> {
        E data;
        Node<E> next;

       public Node(E data, Node<E> next) {
           this.data = data;
           this.next = next;
       }
   }
    //12345 l2 r4
   public Node<E> reverse(Node<E> head , int left , int right){
       if (head ==null || left <1 ||left >size ||right<1 || right>size ||left>right ||left==right){
           return head;
       }

       // 1、找出左节点的起始地址。
       // 2、从左边遍历到右节点，然后把数据先存入集合。

       Node<E> first = head;
       Node<E> mark = null;
       List<E> nodes = new ArrayList<>();
       int index = 0;
       while (head !=null){
           index++;
           if (index == left)mark = head;
           if (index>=left && index<=right)nodes.add(head.data);
           if (index == right)break;

           head = head.next;
       }
       for (int i = nodes.size() -1; i >=0 ; i--) {
           E e = nodes.get(i);
           mark.data = e;
           mark = mark.next;

       }


       return first;
   }
   public Node<E> add(){
       Node<E> head = null;
       Scanner sc = new Scanner(System.in);
       while (true){
           System.out.println("请您输入下一个结点数据");
           String data = sc.next();
           if (data.equals("exit"))break;
           if (head == null){head = new Node(data,null);
           size++;}else {
           Node<E> temp = head;
           while (temp.next != null) temp = temp.next;
               temp.next = new Node(data ,null);
           size++;
           }



       }
       return head;
   }
   public void forEach(Node<E> head){
       if (head == null){
           System.out.println(head);
           return;
       }
      while (head != null ){
          System.out.print(head.data + "\t");
          head = head.next;
      }
   }
}
