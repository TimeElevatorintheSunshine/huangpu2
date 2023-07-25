package itheima.demo5;

import java.util.*;

public class MyArrList<E> {
    private Object[] element = {};
    private int size;
    public int size(){
        return size;
    }
    public void add(int index, E e){
        check(index);
        if (size == element.length){
            grow(size);
        }
        int moveFlag = size - index;
            System.arraycopy(element,index,element,index+1,moveFlag);
            element[index] = e;
            size++;


    }
    public boolean addAll(Collection<? extends E> c){
        Object[] a = c.toArray();
        int numNew = a.length;
        grow(size + numNew);
        System.arraycopy(a, 0, element, size, numNew);
        size += numNew;
        return numNew != 0;
    }

    private void growAll(int i) {

    }

    public boolean add (E e){
        if (size == element.length){
            grow(size);}
        element[size++] = e;
        return true;
    }
    private void grow(int size) {
        if (size == 0 ){
            element = new Object[10];
        }else {
            element = Arrays.copyOf(element,element.length + (element.length>>1));
        }
    }
    public void forEach(MyConsumer consumer){
        Objects.requireNonNull(consumer);
        for (int i = 0; i < size; i++) {
            consumer.accept(element[i]);
        }

    }
    private void check(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException(index +" out of max length "+ size);
        }
    }
}
interface MyConsumer<E>{
    void accept(E e);
}
