package com.ui;

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

        // 创建面板
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());  // 使用 BorderLayout 管理器
        panel.setBackground(new Color(245, 245, 245));

        // 创建标题标签
        JLabel titleLabel = new JLabel("人事管理系统", JLabel.CENTER);
        titleLabel.setFont(new Font("楷体", Font.BOLD, 20));
        titleLabel.setForeground(new Color(0, 123, 255));
        panel.add(titleLabel, BorderLayout.NORTH);

        // 创建内容面板（包括用户名、密码、按钮等）
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridBagLayout());
        contentPanel.setBackground(new Color(245, 245, 245));

        // 设置布局管理器
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // 边距

        // 创建标签和文本框
        JLabel userLabel = new JLabel("用户名:");
        userLabel.setFont(new Font("楷体", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 0;
        contentPanel.add(userLabel, gbc);

        JTextField userText = new JTextField(20);
        userText.setFont(new Font("楷体", Font.PLAIN, 14));
        userText.setBackground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 0;
        contentPanel.add(userText, gbc);

        JLabel passwordLabel = new JLabel("密码:");
        passwordLabel.setFont(new Font("楷体", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 1;
        contentPanel.add(passwordLabel, gbc);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setFont(new Font("楷体", Font.PLAIN, 14));
        passwordText.setBackground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 1;
        contentPanel.add(passwordText, gbc);

        // 创建登录按钮
        JButton loginButton = new JButton("登录");
        loginButton.setFont(new Font("楷体", Font.BOLD, 16));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(0, 123, 255));  // 按钮颜色
        loginButton.setFocusPainted(false);
        gbc.gridx = 0;
        gbc.gridy = 2;
        contentPanel.add(loginButton, gbc);

        JButton registerButton = new JButton("注册");
        registerButton.setFont(new Font("楷体", Font.BOLD, 16));
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(new Color(0, 123, 255));  // 按钮颜色
        registerButton.setFocusPainted(false);
        gbc.gridx = 1;
        gbc.gridy = 2;
        contentPanel.add(registerButton, gbc);

        // 登录按钮点击事件
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                char[] password = passwordText.getPassword();
                JOptionPane.showMessageDialog(frame, "Username: " + username + "\nPassword: " + new String(password));
            }
        });

        // 注册按钮点击事件
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                char[] password = passwordText.getPassword();
                JOptionPane.showMessageDialog(frame, "Username: " + username + "\nPassword: " + new String(password));
            }
        });

        // 将内容面板添加到框架
        panel.add(contentPanel, BorderLayout.CENTER);
        frame.add(panel);
        frame.setVisible(true);
    }
}
