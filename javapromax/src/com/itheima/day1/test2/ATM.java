package com.itheima.day1.test2;

import java.util.*;

public class ATM {

    private static final Scanner sc = new Scanner(System.in);
    private static final List<Account> accounts = new ArrayList<>();
    private Account loginAccount;
    public  void start(){
        while (true) {
            System.out.println("=========欢迎进入ATM系统========");
            System.out.println("请选择一下功能，1.登录账户，2.注册账户");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    useUp();
                    break;
                case 2:
                    add();
                    break;
                default:
                    System.out.println("输入有误");
            }
        }
    }

    private  void useUp() {
        if (accounts.size() == 0) {
            System.out.println("无账号，请注册");
            return; //卫语句风格
        }
        System.out.println("请输入您的id");
        String id = sc.next();
        for (int i = 0; i < accounts.size(); i++) {
            if (id.equals(accounts.get(i).getCardId())) {
                System.out.println("请输入密码");
                while (true) {
                    String password = sc.next();


                    if (accounts.get(i).getPassword().equals(password)) {
                        loginAccount = accounts.get(i);
                        userMenu();
                        return;
                    } else {
                        System.out.println("密码错误，请重新输入");
                    }
                }
            } else {
                System.out.println("查无此id，请注册账户");
                return;
            }

        }
        }





    private  void userMenu() {
        while (true) {
            System.out.println("=========登录系统成功========");
            System.out.println("请选择以下功能");
            System.out.println("1.查询");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.改密");
            System.out.println("6.退出");
            System.out.println("7.销户");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    query();
                    break;
                case 2:
                    saveMoney();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:sendMoney();
                    break;
                case 5:
                    setPassWord();
                    return;
                case 6:
                    System.out.println("退出成功");
                    return;
                case 7:
                    removeUser();
                    return;
            }
        }

    }

    private  void removeUser( ) {
        if (loginAccount.getBalance() > 0){
        System.out.println("账户中有余额不允许销户");
        return;
        }
        System.out.println("您确定销户吗？y/n");
        String command = sc.next();
        switch (command){
            case "y":
                accounts.remove(loginAccount);
                break;
            case "n":
                System.out.println("账户保留");
                break;
        }
    }

    private  void setPassWord() {
        System.out.println("请输入原密码");
        String passWord = sc.next();
        if (passWord.equals(loginAccount.getPassword())){
            System.out.println("请输入新密码");
            while (true) {
                String password1 = sc.next();
                System.out.println("请确认您的密码");
                String password2 = sc.next();
                if (password2.equals(password1)) {
                    System.out.println("修改成功");
                    loginAccount.setPassword(password2);
                    return;
                }else {
                    System.out.println("两次密码不一致，重新输入");
                }
            }
        }else {
            System.out.println("密码不正确");
        }
    }

    private  void sendMoney() {
        if (accounts.size() < 2){
            System.out.println("账户不足两人，请创建");
            return;
        }
        if (loginAccount.getBalance() == 0){
            System.out.println("余额为0，不能转账");
            return;
        }

        while (true) {
            System.out.println("请问需要转账id是多少");
            String id = sc.next();
            for (int i = 0; i < accounts.size(); i++) {
                if (id.equals(accounts.get(i).getCardId())){
                    String userName = accounts.get(i).getName();
                    String tipName = "*" + userName.substring(1);
                    System.out.println("请您确认[" + tipName +"]的姓氏");
                    String preName = sc.next();
                    if (!userName.startsWith(preName)){
                        System.out.println("姓氏错误");
                        continue;
                    }
                    System.out.println("请问需要转账多少");
                    int sendMoney = sc.nextInt();
                    if (loginAccount.getBalance()<sendMoney){
                        System.out.println("余额不足");
                        return;
                    }
                    loginAccount.setBalance(loginAccount.getBalance() -sendMoney);
                    accounts.get(i).setBalance(accounts.get(i).getBalance() + sendMoney);
                    return;
                }
            }
            System.out.println("查无id,请输入正确id");
        }

    }

    private  void withdraw() {
        if (loginAccount.getBalance() ==0 ){
            System.out.println("无余额");
            return;
        }
        System.out.println("请问您需要取多少钱");
        while (true) {
            int withdraw = sc.nextInt();
            if (loginAccount.getBalance() < withdraw ){
                System.out.println("余额不足");
                return;
            }
            if (withdraw > loginAccount.getWithdraw()){
                System.out.println("超过取款额度");
            }else {
                loginAccount.setBalance(loginAccount.getBalance() - withdraw);
                System.out.println("恭喜取款成功，余额" + loginAccount.getBalance() );
                return;
            }
        }
    }

    private  void saveMoney() {
        int saveMoney = 0;
        while (true) {
            System.out.println("请问您需要存多少钱");
            saveMoney = sc.nextInt();
            if (saveMoney < 100){
                System.out.println("存款不能小于100");
                continue;
            }
            loginAccount.setBalance(loginAccount.getBalance() + saveMoney);
            query();
            return;
        }


    }

    private  void query() {
        System.out.println("======账户信息======");
        System.out.println("名字:" + loginAccount.getName());
        System.out.println("性别:" + loginAccount.getSex());
        System.out.println("id:" + loginAccount.getCardId());
        System.out.println("存款:" + loginAccount.getBalance());
        System.out.println("取款额度:" + loginAccount.getWithdraw());
    return;
    }


    private void add() {
        Account account = new Account();
        System.out.println("请输入您的名字");
        account.setName(sc.next());
        System.out.println("请输入您的性别");
        account.setSex(sc.next());
        System.out.println("请输入您的密码");
        while (true) {
            String password = sc.next();
            System.out.println("请确认您的密码");
            String password1 = sc.next();
            if (password.equals(password1)) {
                account.setPassword(password);
                break;
            } else {
                System.out.println("两次密码不一致，请重新输入");
            }
        }
        System.out.println("请输入您的取款额度");
        account.setWithdraw(sc.nextInt());
        account.setCardId(getId());
        System.out.println("感谢您注册成功您的卡号是" + account.getCardId());
        accounts.add(account);


    }

    private String getId() {
        Date date = new Date();
        String s = date.getTime() + "";
        String substring = s.substring(3, 11);
        return substring;

    }
}
