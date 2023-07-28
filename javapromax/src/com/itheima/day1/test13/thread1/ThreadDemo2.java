package com.itheima.day1.test13.thread1;


import com.sun.source.tree.SynchronizedTree;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo2 {
    public static void main(String[] args) {
        Account acc = new Account("ICBC-001", 100000);
        new DrawThread(acc, "小明").start();
        new DrawThread(acc, "小红").start();
        Account acc1 = new Account("ICBC-002", 100000);
        new DrawThread(acc1, "小黑").start();
        new DrawThread(acc1, "小白").start();

    }
}

class DrawThread extends Thread {
    private Account acc;

    public DrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.drawMoney(100000);
    }
}

class Account {
    private String cardId;
    private double money;
    // 锁对象
    private final Lock lk = new ReentrantLock();

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
        //同步代码块
    //    public void drawMoney(double money) {
//        String name = Thread.currentThread().getName();
//        synchronized (this) {
//            if (this.money >= money) {
//                System.out.println(name + "来取钱" + money + "成功");
//                this.money -= money;
//                System.out.println(name + "来取钱后剩余" + this.money);
//            } else {
//                System.out.println(name + "来取钱，余额不足");
//            }
//        }
    // 同步方法
//    public synchronized void drawMoney(double money) {
//        String name = Thread.currentThread().getName();
//            if (this.money >= money) {
//                System.out.println(name + "来取钱" + money + "成功");
//                this.money -= money;
//                System.out.println(name + "来取钱后剩余" + this.money);
//            } else {
//                System.out.println(name + "来取钱，余额不足");
//
//        }
    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        lk.lock();
        try {
            if (this.money >= money) {
                System.out.println(name + "来取钱" + money + "成功");
                this.money -= money;
                System.out.println(name + "来取钱后剩余" + this.money);
            } else {
                System.out.println(name + "来取钱，余额不足");

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lk.unlock();
        }


    }
}