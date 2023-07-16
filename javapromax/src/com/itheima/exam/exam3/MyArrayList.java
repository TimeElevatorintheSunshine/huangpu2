package com.itheima.exam.exam3;

import com.itheima.day3.abstract3.People;
import com.itheima.exam.exam1.MyConsumer;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<E> {
    private Object[] elementData = {};
    private int size; // 记录元素个数，记录下个位置
    private int DEFAULT_CAPACITY = 10;
    public int size(){
        return size;
    }

    public void foreach(MyConsumer<E> action){
        Objects.requireNonNull(action);
        for (int i = 0; i < size; i++) {
            action.accept((E)elementData[i]);
        }
    }
    public boolean add(E e){
    //判断是否需要扩容
        if (size == elementData.length){grow();}
        elementData[size++] = e;
        return true;
}
public E get(int index){
        //做越界判断
    checkIndex(index);
    return (E) elementData[index];
}
public E remove(int index){
        checkIndex(index);
        E e = (E) elementData[index];
        int moveFlag = size -index -1;
        if (moveFlag != 0){
            System.arraycopy(elementData,index + 1,elementData,index,moveFlag);
        }
        elementData[--size] = null;
        return e;
}
    private void checkIndex(int index) {
        if (index <0 || index >=size){
            throw new IndexOutOfBoundsException(index + " out of max length" + size);
        }
    }

    /**
     * 扩容
     */
    private void grow() {
        if(size == 0 ){
            elementData = new Object[DEFAULT_CAPACITY];
        }else {
            elementData = Arrays.copyOf(elementData,elementData.length+elementData.length>>1);
        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            E e = (E) elementData[i];
            sb.append(e).append(i == size-1? "" : ",");
        }
        sb.append("]");
        return sb.toString();
    }
}
