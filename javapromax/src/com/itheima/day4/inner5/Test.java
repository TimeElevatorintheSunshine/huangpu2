package com.itheima.day4.inner5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        // 拓展：真实开发场景
        //GUI 创建窗口
        JFrame win = new JFrame("登录");
        JPanel jPanel = new JPanel();
        win.add(jPanel);
        //添加一个按钮
        JButton btn = new JButton("登录一下");
        jPanel.add(btn);
        //匿名内部类很少主动使用，一般需要的时候才使用
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("登录一下");
            }
        });
       // btn.addActionListener(e-> System.out.println("登陆一下"));



        // 设置窗口属性
        win.setSize(400,300);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
