package com.itheima.schoolwork.day1;

/**
 * 定义银行卡：主卡和副卡类，完成下列功能
 * 1、完成银行卡-主卡的存取款方法
 *   主卡卡有余额，卡号，户主等属性
 *   有存款和取款的方法（取款时候余额不足要有提示）
 * 2、完成银行卡-副卡的取款方法
 *   副卡额外有透支额度属性(副卡可用主卡中余额，且余额不够，可以透支额度)
 *   副卡重写取款方法（取款时候余额不足要有提示）
 * 3、写测试案例，分别测试主卡和副卡的存取款功能（存取款后显示余额）
 */
public class Question3 {
    public static void main(String[] args) throws Exception{
        mainCard mainCard = new mainCard("张三",500.0,"12345678");
        mainCard.deposit(600.0);
        mainCard.withdrawal(700.0);
        mainCard.withdrawal(1000.0);
        assistant assistant = new assistant("李四",mainCard.balance,"87654321");
        assistant.setLimit(1000.0);
        assistant.deposit(100.0);
        assistant.withdrawal(200.0);
        assistant.withdrawal(1000.0);


    }
}

class assistant extends Card{

    private Double limit;

    public void withdrawal(double money)throws  Exception{
        System.out.println("用副卡取" + money);
        Thread.sleep(2000);
        if (balance > money){
            balance -= money;
            System.out.println("卡号为" + id + "户主为" + name);
            System.out.println("取款成功，余额为" + balance+ ",透支额度"+limit);
            Thread.sleep(2000);
        }else {
            money -= balance;
            balance -= balance;
            if (limit < money){
                System.out.println("额度不足");
                return;
            }
            limit -= money;
            System.out.println("卡号为" + id + "户主为" + name);
            System.out.println("取款成功，余额为" +balance+",透支额度"+limit);
            Thread.sleep(2000);
        }


    }
    public void deposit(double money)throws  Exception{

        System.out.println("用副卡存" + money);
        Thread.sleep(2000);
        balance += money;
        System.out.println("卡号为" + id + "户主为" + name);
        System.out.println("存款成功，余额为" + balance);
        Thread.sleep(2000);
    }
    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public assistant() {
    }

    public assistant(String name,Double balance, String id) {
        super(name,balance, id);
        System.out.println("初始 银行卡- 副卡余额为" + balance );
    }

    public assistant(Double limit) {
        this.limit = limit;
    }

    public assistant(String name,Double balance, String id, Double limit) {
        super(name,balance, id);
        this.limit = limit;
    }
}
class mainCard extends Card{

    public void withdrawal(double money)throws Exception{
        System.out.println("用主卡取" + money);
        Thread.sleep(2000);
        if (balance < money){
            System.out.println("余额不足,取款失败"
            );
            Thread.sleep(2000);
            return;
        }
        balance -= money;
        System.out.println("卡号为" + id + "户主为" + name);
        System.out.println("取款成功，余额为" + balance);
        Thread.sleep(2000);


    }
    public void deposit(double money)throws Exception{

        balance += money ;
        System.out.println("用主卡存" + money);
        Thread.sleep(2000);
        System.out.println("卡号为" + id + "户主为" + name);
        System.out.println("存款成功，余额为" + balance);
        Thread.sleep(2000);
    }
    public mainCard() {

    }

    public mainCard(String name,Double balance, String id) {
        super(name,balance, id);
        System.out.println("初始 银行卡- 主卡余额为" + balance );
    }
}
class Card{
    public String name;
    public Double balance ;
    public String id;
    public void withdrawal(){

    }
    public void deposit(){}

    public Card() {
    }

    public Card(String name, Double balance, String id) {
        this.name = name;
        this.balance = balance;
        this.id = id;
    }
}