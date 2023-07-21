package com.itheima.day7.List1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args)throws Exception {
       // 1.做队列
        LinkedList<String> queue = new LinkedList<>();
        queue.add("1号");
        queue.add("2号");
        queue.add("3号");
        queue.add("4号");
        System.out.println(queue);
        int a = queue.size();
        for (int i = 0; i < a; i++) {
            queue.removeFirst();
            Thread.sleep(1000);
            System.out.println(queue);
        }

        // 做栈，后进先出
        LinkedList<String> stack = new LinkedList<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        System.out.println(stack);
        int a1 = stack.size();
        for (int i = 0; i < a1; i++) {
            stack.pop();
            Thread.sleep(1000);
            System.out.println(stack);
        }

    }
}
