package com.itheima.day1.test13.thread1;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Thread thread = new Thread(new MyRunnable());
        thread.start();
        Thread thread1 = new Thread(() -> {});
        thread1.start();


        FutureTask futureTask = new FutureTask<>(new MyCallable());
        Thread thread2 = new Thread(futureTask);
        thread2.start();

    }
}


class MyThread extends Thread{
    @Override
    public void run() {}


}
class MyRunnable implements Runnable{

    @Override
    public void run() {

    }
}
class MyCallable implements Callable{

    @Override
    public Object call() throws Exception {
        return null;
    }
}