package itheima.demo6;

import com.sun.xml.internal.ws.encoding.MtomCodec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        MyLinkedList<Integer> s = new MyLinkedList<>();
        s.add(Integer.MAX_VALUE);
        s.add(Integer.MIN_VALUE);


        /*s.deleteAtIndex(4);
        s.forEach(System.out::println);
         s.deleteAtIndex(1);
        s.forEach(System.out::println);*/
        s.sort();
       s.forEach(System.out::println);
//        s.sort();
//        s.deleteDuplicate();
//        s.forEach(System.out::println);

        ArrayList<Double> doubles = new ArrayList<Double>();
        doubles.add(0.24);
        doubles.add(0.14);
        doubles.add(0.64);
        doubles.add(0.24);
        doubles.add(0.287);
        doubles.add(0.124);
        Collections.sort(doubles);
        System.out.println(doubles);
    }
}
