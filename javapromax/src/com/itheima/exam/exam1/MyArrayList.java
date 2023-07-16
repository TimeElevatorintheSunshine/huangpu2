package com.itheima.exam.exam1;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Consumer;

public class MyArrayList<E> {
    private Object[] arr = {};
    private int size;

    public void foreach(MyConsumer<E> action){
        Objects.requireNonNull(action);
        for (int i = 0; i < size; i++) {
            action.accept((E)arr[i]);
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
               if (i != size -1){
                   sb.append(arr[i]).append(",");
               }else {
                   sb.append(arr[i]);
               }
        }
        sb.append("]");
        return sb.toString();
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size ==0;
    }
    public E remove(int a){
        E e = null;
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == arr[a] && flag==false){
                 e = (E) arr[i];
                 flag =true;
            }
            if (flag) if (i != arr.length-1)arr[i] = arr[i+1];
        }
        arr = Arrays.copyOfRange(arr,0,--size);
        return e;
    }

    public E index(int a){
        for (int i = 0; i < size; i++) {
            if (arr[i] == arr[a])return (E)arr[i];
        }
        return null;
    }
    public void add(E e){
        if (size == arr.length)grow();
        arr[size++] = e;
        return;
    }

    private void grow() {
        if (size == 0){
            arr= new Object[10];
        }else {
            arr = Arrays.copyOf(arr,arr.length+(arr.length>>1));
        }

    }
}
