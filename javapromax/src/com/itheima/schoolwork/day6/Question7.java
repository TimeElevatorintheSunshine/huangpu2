package com.itheima.schoolwork.day6;

import sun.net.TelnetOutputStream;

import java.util.ArrayList;
import java.util.Random;

public class Question7 {
    public static void main(String[] args) {
        ArrayList<ProductItem> productItem = new ArrayList<>();
        ArrayList<ArrayList<ProductItem>> productItems = new ArrayList<>();
        Random random = new Random();
        productItem.add(new ProductItem("001","苹果","001", random.nextInt(100000000),9999.0));
        productItem.add(new ProductItem("002","纸","002",random.nextInt(100000000),9999.0));
        productItem.add(new ProductItem("003","电脑","003",random.nextInt(100000000),9999.0));
        productItem.add(new ProductItem("004","饮料","004",random.nextInt(100000000),9999.0));
        productItems.add(productItem);
        for (ArrayList<ProductItem> item : productItems) {
            for (ProductItem productItem1 : item) {
                System.out.println(productItem1);
            }

        }



    }
}
class ProductItem{
    private String id;
    private String name;
    private String ItemId;
    private int ItemName;
    private Double price;

    @Override
    public String toString() {
        return "ProductItem{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", ItemId='" + ItemId + '\'' +
                ", ItemName='" + ItemName + '\'' +
                ", price=" + price +
                '}';
    }

    public ProductItem() {
    }

    public ProductItem(String id, String name, String itemId, int itemName, Double price) {
        this.id = id;
        this.name = name;
        ItemId = itemId;
        ItemName = itemName;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemId() {
        return ItemId;
    }

    public void setItemId(String itemId) {
        ItemId = itemId;
    }

    public int getItemName() {
        return ItemName;
    }

    public void setItemName(int itemName) {
        ItemName = itemName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}