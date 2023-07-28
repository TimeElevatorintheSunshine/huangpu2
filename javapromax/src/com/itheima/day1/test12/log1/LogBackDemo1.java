package com.itheima.day1.test12.log1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogBackDemo1 {
    public static final Logger LOGGER = LoggerFactory.getLogger("LogBackDemo1");
    public static void main(String[] args) {
        try {
            LOGGER.info("chu法方法开始执行~~~~");
            chu(10, 0);
            LOGGER.info("chu法方法执行成功~~~~");
        } catch (Exception e) {
            LOGGER.error("chu法方法执行失败，出现了bug~~~~" + e);
        }

    }

    public static void chu(int a, int b) {
        LOGGER.debug("参数a:" + a);
        LOGGER.debug("参数b:" + b);
        int c = a / b;
        System.out.println("结果是：" + c);
        LOGGER.info("结果是:" + c);
    }
}
