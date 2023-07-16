package com.itheima.teacher;

public class TeacherTest {
    public static void main(String[] args) {
        MainCard card = new MainCard("12345678",500.0,"张三");
        card.deposit(600);
        card.drawMoney(700);
        card.drawMoney(1000);
        SecondCard secondCard = new SecondCard(1000,card);
        secondCard.setCardId("87654321");
        secondCard.setOwner("李四");
        secondCard.deposit(100);
        secondCard.drawMoney(200);
        secondCard.drawMoney(1000);
        card.deposit(500);
        secondCard.drawMoney(300);

    }

}
class SecondCard extends MainCard{
    private double limit;
    private MainCard mainCard;

    public SecondCard() {
    }
    public SecondCard(double limit ,MainCard mainCard) {
        this.limit = limit;
        this.mainCard = mainCard;
        System.out.println("初始化银行副卡，余额为 "+ mainCard.getMoney());
    }
    @Override
    public void deposit(double money){
        System.out.println("用副卡存" + money);
        mainCard.setMoney(mainCard.getMoney() + money);
        System.out.println("卡号为" + getCardId() + "户主为" +  getOwner());
        System.out.println("存款成功，余额为：" + mainCard.getMoney());
    }
    @Override
    public void drawMoney(double money){
        System.out.println("用副卡取" + money);
        if(mainCard.getMoney() >= money){
            mainCard.setMoney(mainCard.getMoney()-money);
            System.out.println("卡号为" + getCardId() + "户主为" +getOwner());
            System.out.println("取款成功，余额为" + mainCard.getMoney()+ ",透支额度"+limit);
        }else {
            money -= mainCard.getMoney();
            mainCard.setMoney(0);
            if (limit < money){
                System.out.println("额度不足");
                return;
            }
            limit -= money;
            System.out.println("卡号为" + getCardId() + "户主为" + getOwner());
            System.out.println("取款成功，余额为" +mainCard.getMoney()+",透支额度"+limit);

        }
    }
}

class MainCard{
    private String cardId;
    private double money;
    private String owner;



        public void deposit(double money){
        System.out.println("用主卡存" + money);
        this.money += money;
        System.out.println("卡号为" + cardId + "户主为" +  owner);
            System.out.println("存款成功，余额为：" + money);
        }
    public void drawMoney(double money){
        System.out.println("用主卡取" + money);
       if (this.money>= money){
           this.money -= money;
           System.out.println("卡号为" + cardId + "户主为" +  owner);
           System.out.println("取款成功，余额为：" + money);
       }else {
           System.out.println("余额不足，取款失败");
       }
    }

    public MainCard() {
    }

    public MainCard(String cardId, double money, String owner) {
        this.cardId = cardId;
        this.money = money;
        this.owner = owner;
        System.out.println("初始化银行主卡，余额为 "+ money);
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}