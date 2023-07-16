package com.itheima.exam.exam;

@FunctionalInterface
public interface MyConsumer<E> {
    void accept(E e);
}
