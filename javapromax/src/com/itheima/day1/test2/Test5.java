package com.itheima.day1.test2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 商品属性：商品id，商品名称，商品价格，商品购买数量
 * 程序运行，往数组或者集合中添加3个商品，商品id，名称，价格自己任意书写。
 * 完成以下功能：
 * 添加商品：
 * 要求：商品的id都要唯一
 * 删除商品：
 * 要求：根据id删除商品，如果存在，则删除，如果不存在，则提示删除失败
 * 修改商品：
 * 要求：将其中任意一件商品的数量+1
 * 查询商品：
 * 要求：根据商品的id进行查询，如果存在，打印商品所有信息，如果不存在，则提示没有这个商品
 * 结算：
 * 累加总额
 */
public class Test5 {
    public static void main(String[] args) {
        GoodManger m = new GoodManger();
        m.addGoods();
        m.addGoods();
        m.addGoods();
        m.remove();
        m.add();
        m.query();
        m.queryGood();
        m.sumMoney();

    }
}

class GoodManger {
    private HashMap<Goods, Integer> map = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void query() {
        System.out.println(map);
    }

    public void sumMoney() {
        int sum = 0;
        for (Goods good : map.keySet()) {
            sum += (good.getPrice() * map.get(good));
        }
        System.out.println(sum);
    }

    public void queryGood() {
        System.out.println("请输入要查询的id");
        String id = sc.next();
        for (Goods good : map.keySet()) {
            if (good.getId().equals(id)) {
                System.out.println(good + "数量" + map.get(good));
                return;
            }
        }
        System.out.println("无此商品");
    }

    public void add() {
        System.out.println("请输入要增加的id");
        String id = sc.next();
        for (Goods good : map.keySet()) {
            if (good.getId().equals(id)) {
                map.put(good, map.get(good) + 1);
            }
        }
    }

    public void remove() {
        System.out.println("请输入要删除的id");
        String id = sc.next();
        Goods good1 = null;
        for (Goods good : map.keySet()) {
            if (good.getId().equals(id)) {
                good1 = good;
            }
        }
        for (int i = 0; i < map.size(); i++) {
            if (map.containsKey(good1)) {
                map.remove(good1);
                return;
            }
        }
        System.out.println("无此商品删除失败");
    }

    public void addGoods() {
        Goods goods = new Goods();
        System.out.println("请输入录入id");
        String id = null;
        out:
        while (true) {
            id = sc.next();
            for (Goods good : map.keySet()) {
                if (good.getId().equals(id)) {
                    System.out.println("id重复请重新录入");
                    continue out;
                }
            }
            goods.setId(id);
            System.out.println("请输入录入名称");
            String name = sc.next();
            goods.setName(name);
            System.out.println("请输入录入价格");
            double price = sc.nextDouble();
            goods.setPrice(price);
            map.put(goods, 1);
            return;
        }

    }
}

class Goods {
    private String name;
    private String id;
    private double price;

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                '}';
    }

    public Goods() {
    }

    public Goods(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}