package com.it.gui;

import javax.swing.*;
import java.awt.*;

public class flow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(new JButton("按钮1"));
        frame.add(new JButton("按钮2"));
        frame.add(new JButton("按钮3"));
        frame.add(new JButton("按钮4"));
        frame.add(new JButton("按钮5"));
        frame.add(new JButton("按钮6 "));
        frame.setVisible(true);

    }
}
