package com.itheima.exam.exam10;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class MyArrayList<E>  {
    private static Object[] element = {};
    private int size;
    public int size(){
        return size;
    }
    public void forEach(MyConsumer consumer){
        Objects.requireNonNull(consumer);
        for (int i = 0; i < size; i++) {
            consumer.accept(element[i]);
        }

    }

    public E remove(int index){
        check(index);
        E e = (E)element[index];
        int moveFlag = size - index -1;
        if (moveFlag !=0){
            System.arraycopy(element,moveFlag,element,index,size);
        }
        element[--size] = null;
        return e;
    }

    public E get(int index){
       check(index);
        return (E)element[index];
    }

    private void check(int index) {
        if (index < 0 || index >= size){
             throw new IndexOutOfBoundsException(index +" out of max length "+ size);
        }
    }

    public boolean add (E e){
        if (size == element.length){
        grow();}
        element[size++] = e;
        return true;
    }

    /**
     * 扩容
     */
    private void grow() {
        if (size == 0 ){
            element = new Object[10];
        }else {
            element = Arrays.copyOf(element,element.length + element.length>>1);
        }
    }
}
interface MyConsumer<E>{
    void accept(E e);
}
