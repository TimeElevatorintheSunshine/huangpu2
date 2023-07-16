package com.itheima.day1.test2;

public class Account {
    private String cardId;
    private String name;
    private String sex;
    private String password;
    private double balance = 0.0;
    private  int withdraw;

    @Override
    public String toString() {
        return "Account{" +
                "cardId='" + cardId + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", withdraw=" + withdraw +
                '}';
    }

    public Account() {
    }

    public Account(String cardId, String name, String sex, String password, double balance, int withdraw) {
        this.cardId = cardId;
        this.name = name;
        this.sex = sex;
        this.password = password;
        this.balance = balance;
        this.withdraw = withdraw;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }
}
