package com.itheima.day1.test13.thread1;

import java.util.concurrent.*;

public class ThreadDemo3 {
    public static void main(String[] args) {
//            new ThreadPoolExecutor(int corePoolSize,
//                                    int maximumPoolSize,
//                                    long keepAliveTime,
//                                    TimeUnit unit,
//                                    BlockingQueue<Runnable> workQueue,
//                                    ThreadFactory threadFactory,
//                                    RejectedExecutionHandler handler)
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());


    }
}
