package com.it.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Test1 {
    public static void main(String[] args) {
        JFrame win = new JFrame("测试"); //创建窗口
        win.setSize(400, 400);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(); //创建桌布
        win.add(panel);
        JButton button = new JButton("点击我");//创建按钮
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win, "欢迎进入");
            }
        });
        win.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("==================");
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    System.out.println("向上移动");
                }else if(e.getKeyCode()== KeyEvent.VK_DOWN){
                    System.out.println("向下移动");
                }else if(e.getKeyCode()== KeyEvent.VK_LEFT){
                    System.out.println("向左移动");
                }else if(e.getKeyCode()== KeyEvent.VK_RIGHT){
                    System.out.println("向右移动");
                }

            }
        });
        button.addActionListener(e -> System.out.println("登录成功"));
        win.setVisible(true);
        win.requestFocus();
    }
}
