package com.itheima.exam1.demo3;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;


public class Test {
    private static ArrayList<Liquid> liquid = new ArrayList<>();
    private static Integer sum = 0;
    private static String name;
    public static void main(String[] args) {
        // 创建物品对象，封装液体数据
        liquid.add(new Liquid("水", 24, 4));
        liquid.add(new Liquid("牛奶", 160, 8));
        liquid.add(new Liquid("五粮液", 4000, 2));
        liquid.add(new Liquid("可乐", 108, 6));
        liquid.add(new Liquid("茅台", 4000, 1));

        // 对集合按照价格排序
        Collections.sort(liquid,(o1,o2)->(Double.compare(o2.getUnitPrice(),o1.getUnitPrice())));
        System.out.println(liquid);

        // 从高到低，总共拿10升
        double allLiter = 10;
        double allMoney =0.0;
        for (Liquid liquid1 : liquid) {
            double liter = liquid1.getLiter();
            if (liter >=allLiter){
                System.out.println(liquid1.getName() + "应该取走" + allLiter);
                allMoney += allLiter * liquid1.getUnitPrice();
                break;
            }else {
                System.out.println(liquid1.getName() + "应该取走" + liter);
                allMoney += liter * liquid1.getUnitPrice();
                allLiter -= liter;
            }
        }
        System.out.println("最大价值是" + allMoney);



    }
}
class Liquid{
    private String name;
    private Integer price;
    private Integer liter;

    @Override
    public String toString() {
        return "Liquid{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", liter=" + liter +
                '}';
    }

    public double getUnitPrice(){
        BigDecimal a1 = BigDecimal.valueOf(price);
        BigDecimal a2 = BigDecimal.valueOf(liter);
        return a1.divide(a2,2, RoundingMode.HALF_UP).doubleValue();
    }

    public Liquid() {
    }

    public Liquid(String name, Integer price, Integer liter) {
        this.name = name;
        this.price = price;
        this.liter = liter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getLiter() {
        return liter;
    }

    public void setLiter(Integer liter) {
        this.liter = liter;
    }
}