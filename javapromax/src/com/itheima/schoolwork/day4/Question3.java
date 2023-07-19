package com.itheima.schoolwork.day4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 秒杀是网上竞拍的一种新方式，指商家在网络平台发布一些超低价格的商品，
 *  让所有买家在同一时间抢购的一种销售方式。由于商品价格非常低廉，通常活动时间一到，商品就会被买
 *
 * 家抢购一空，有时甚至只用一秒钟，所以该种方式被称为秒杀。在秒杀活动页面往往会有一个倒计时的功能，如下图所示：
 */
public class Question3 {
    public static void main(String[] args)throws Exception  {

        Timer timer = new Timer();
                        //对象名        间隔时间    延迟
        timer.schedule(new TimeTask(),0,1000);

    }
}
