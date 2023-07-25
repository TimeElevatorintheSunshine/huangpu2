package com.itheima.exam1.demo5;


import java.util.*;
import java.util.function.Consumer;

public class MyArrayList<E> {
    private Object[] elementData;
    private int size; // 记录集合元素个数
    private static final int DEFAULT_CAPACITY = 10;

    public int size(){
        return size;
    }
    public boolean add(E e) {
        grow();
        elementData[size++] = e;
        return true;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        Object[] elementData = this.elementData;
        final int s = size;
        for (int i = 0; i < s; i++) {
            sj.add("" +  elementData[i]);
        }
        return sj.toString();
    }

    public boolean addAll(MyArrayList<? extends E> c) {
        Object[] a = c.toArray();
        int numNew = a.length;
        final int s = size;
        if (numNew == 0)
            return false;
        if (elementData == null) {
            elementData = new Object[]{};
        }
        int length = elementData.length;
        int minCapacity = numNew + s;

        if (length < minCapacity) {
            int growLength = Math.max(length + (length >> 1),DEFAULT_CAPACITY);
            if (growLength < minCapacity) {
                Arrays.copyOf(elementData, minCapacity);
            } else {
                elementData = Arrays.copyOf(elementData, growLength);
            }
        }
        System.arraycopy(a, 0, elementData, s, numNew);
        size = s + numNew;
        return true;
    }

    private Object[] toArray() {
        return Arrays.copyOf(elementData, size);
    }

    private void grow() {
        if (elementData == null) {
            elementData = new Object[DEFAULT_CAPACITY];
        } else {
            if (size == elementData.length) {
                int newCapacity = elementData.length + (elementData.length >> 1);
                elementData = Arrays.copyOf(elementData, newCapacity);
            }
        }
    }

    public void add(int index, E element) {
        rangeCheckForAdd(index);
        grow();
        System.arraycopy(elementData, index, elementData, index + 1,
                size - index);
        elementData[index] = element;
        size++;
    }
    public void forEach(Consumer<E> consumer){
        Objects.requireNonNull(consumer);
        Object[] elementData = this.elementData;
        final int s = size;
        for (int i = 0; i < s; i++) {
            consumer.accept((E)elementData[i]);
        }
    }

    private void rangeCheckForAdd(int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }


}
