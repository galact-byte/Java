package com.it.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginUI {
    public static void main(String[] args) {
        // 创建框架
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);  // 居中显示

        // 创建桌布
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(245, 245, 245));  // 设置背景颜色

        // 设置布局管理器
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // 边距

        // 创建标签和文本框
        JLabel userLabel = new JLabel("Username:");
        userLabel.setFont(new Font("Arial", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(userLabel, gbc);

        JTextField userText = new JTextField(20);
        userText.setFont(new Font("Arial", Font.PLAIN, 14));
        userText.setBackground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(userText, gbc);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(passwordLabel, gbc);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordText.setBackground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(passwordText, gbc);

        // 创建登录按钮
        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.BOLD, 16));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(0, 123, 255));  // 按钮颜色
        loginButton.setFocusPainted(false);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(loginButton, gbc);

        // 登录按钮点击事件
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                char[] password = passwordText.getPassword();
                JOptionPane.showMessageDialog(frame, "Username: " + username + "\nPassword: " + new String(password));
            }
        });

        // 将面板添加到框架
        frame.add(panel);
        frame.setVisible(true);
    }
}
