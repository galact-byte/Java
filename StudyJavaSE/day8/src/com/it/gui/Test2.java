package com.it.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
        JFrame f=new JFrame("登录窗口");
        JPanel p=new JPanel();
        f.add(p);
        f.setSize(400,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b=new JButton("登录");
        p.add(b);
        b.addActionListener(new MyActionListener(f));
        f.setVisible(true);
    }
}
class MyActionListener implements ActionListener {
    private JFrame f;
    public MyActionListener(JFrame f) {
        this.f=f;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(f,"欢迎");
    }
}
