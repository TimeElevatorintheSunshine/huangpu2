package com.itheima.day2.static2;

import java.util.Random;

public class VerifyUtil {
    private VerifyUtil(){

    }
    public static String creatCode(int n){
        String data = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";

        String code = "";

        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
          return code;
    }

}
