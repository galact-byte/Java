package com.it.gui;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        JFrame f=new JFrame("登录窗口");
        JPanel p=new JPanel();
        f.add(p);
        f.setSize(400,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b=new JButton("登录");
        p.add(b);
        f.setVisible(true);
    }
}
