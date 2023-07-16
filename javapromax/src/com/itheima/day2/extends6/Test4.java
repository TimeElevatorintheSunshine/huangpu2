package com.itheima.day2.extends6;

public class Test4 {
    public static void main(String[] args) {
        Goods goods = new Goods();

    }
}
class Goods{
    private String name;
    private Double price;
    private String ShopName;

    public Goods() {
    }
    public Goods(String name, Double price){
        this(name, price, "黑马程序员");
    }
    public Goods(String name, Double price, String shopName) {
        this.name = name;
        this.price = price;
        ShopName = shopName;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", age=" + price +
                ", SchoolName='" + ShopName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }
}
