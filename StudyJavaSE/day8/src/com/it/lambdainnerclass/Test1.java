package com.it.lambdainnerclass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test1 {
    public static void main(String[] args) {
        JFrame win= new JFrame("测试"); //创建窗口
        win.setSize(400,400);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel= new JPanel(); //创建桌布
        win.add(panel);
        JButton button= new JButton("点击我");//创建按钮
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮被点击了");
            }
        });
        button.addActionListener(e -> System.out.println("登录成功"));
        win.setVisible(true);
    }
}
