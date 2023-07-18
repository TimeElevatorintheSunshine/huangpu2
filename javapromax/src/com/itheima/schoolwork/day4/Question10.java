package com.itheima.schoolwork.day4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * 如图所示:我们使用转账的时候,输入金额之后小数点后面只能输入到2位,而在程序内部,
 * 实际上是把输入的元,转成了分去操作了,当我们转成功之后,会再把分变成元来展示给用户们,请设计程序,完成所描述的需求
 * 提示:直接将元转成分,再将分转成元(至于软件内部怎么操作分的,我们无需关心)
 */
public class Question10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要转账的金额");
        String send = sc.next();
        Double aDouble = changeMoney(send);
        System.out.println(aDouble);

    }
    public static Double changeMoney(String send){
        BigDecimal sendMoney = new BigDecimal(send);
        BigDecimal sendWord = new BigDecimal(100);
        BigDecimal multiply = sendMoney.multiply(sendWord);
        BigDecimal divide = multiply.divide(sendWord, 2, RoundingMode.DOWN);
        double v = divide.doubleValue();
        return v;
    }
}
