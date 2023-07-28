package com.itheima.schoolwork.day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Question8 {
        private   static   Double b = 0.0;
    public static void main(String[] args) {
        String len = null;
        try(
                BufferedReader bf
                        = new BufferedReader(new FileReader("src/com/itheima/schoolwork/day9/questions.txt"));
                BufferedWriter bw
                        = new BufferedWriter(new FileWriter("src/com/itheima/schoolwork/day9/results.txt"));
        ){


           while( (len = bf.readLine()) != null){

               String[] split = null;
               String a = null;
               for (int i = 0; i < len.length(); i++) {
                   if (len.charAt(i) > '9' || len.charAt(i) < '0'){
                       a = len.charAt(i) + "";
                       switch (a){
                           case "+":
                               split = len.split("\\+" );
                               break;
                           case "-":
                               split = len.split("\\-" );
                               break;
                           case "*":
                               split = len.split("\\*" );
                               break;
                           case "/":
                               split = len.split("\\/" );
                               break;
                           default:

                       }

                   }
               }

               switch (a){
                   case "+":
                       b  =  Integer.parseInt(split[0]) * 1.0  +Integer.parseInt(split[1]);
                       break;
                   case "-":
                       b =  Integer.parseInt(split[0]) * 1.0  - Integer.parseInt(split[1]);
                       break;
                   case "*":
                       b =  Integer.parseInt(split[0]) * 1.0  * Integer.parseInt(split[1]);
                       break;
                   case "/":
                       b =  Integer.parseInt(split[0]) * 1.0 / Integer.parseInt(split[1]);
                       break;
                   default:

               }
               bw.write(len + "=" + b);
               bw.newLine();
           }


        }catch (Exception e){
            e.printStackTrace();
        }finally {




        }
    }
}
