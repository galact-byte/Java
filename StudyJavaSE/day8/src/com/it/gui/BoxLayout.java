package com.it.gui;

import javax.swing.*;

public class BoxLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Box");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.Y_AXIS));
        panel.add(new JButton("Button1"));
        panel.add(Box.createVerticalStrut(10));
        panel.add(new JButton("Button2"));
        panel.add(Box.createVerticalStrut(10));
        panel.add(new JButton("Button3"));
        panel.add(Box.createVerticalStrut(10));
        panel.add(new JButton("Button4"));
        frame.add(panel);
        frame.setVisible(true);
    }
}
