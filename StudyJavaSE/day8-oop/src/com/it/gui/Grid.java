package com.it.gui;

import javax.swing.*;
import java.awt.*;

public class Grid {
    public static void main(String[] args) {
        JFrame frame = new JFrame("网格布局");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 3));
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.setVisible(true);
    }
}
