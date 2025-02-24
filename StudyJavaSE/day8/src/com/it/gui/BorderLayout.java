package com.it.gui;

import javax.swing.*;

public class BorderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.BorderLayout());
        frame.add(new JButton("North"), java.awt.BorderLayout.NORTH);
        frame.add(new JButton("South"), java.awt.BorderLayout.SOUTH);
        frame.add(new JButton("West"), java.awt.BorderLayout.WEST);
        frame.add(new JButton("East"), java.awt.BorderLayout.EAST);
        frame.add(new JButton("Center"), java.awt.BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
