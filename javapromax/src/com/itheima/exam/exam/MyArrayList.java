package com.itheima.exam.exam;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<E> {
    private Object[] arr1 = {};
    private int size;

    public int size() {
        return size;
    }
    public void forEach(MyConsumer<E> action) {
        Objects.requireNonNull(action);
        for (int i = 0; i < size; i++) {
            action.accept((E) arr1[i]);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    } public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            E e = (E) arr1[i];
            sb.append(e).append(i == size - 1 ? "" : ", ");
        }
        sb.append("]");
        return sb.toString();
    }
    public boolean remove(E e){
        boolean flag = false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == e ){
                flag = true;

            }
             if (flag){
                 arr1[i]  = i== arr1.length-1 ? null : arr1[i +1];

             }
            // 11 12 13 14
        }
        size--;
        return flag;
    }
    public E index (int a){
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]== arr1[a]){
                return (E) arr1[i];
            }
        }return null;
    }
    public boolean add(E e) {
        if (size == arr1.length)grow();
        arr1[size++] = e;
        return true;
    }

    private void grow() {
       if (size ==0 ){
           arr1 = new Object[10];
       }else {
           arr1 = Arrays.copyOf(arr1,arr1.length+(arr1.length/2));
       }
    }
}
