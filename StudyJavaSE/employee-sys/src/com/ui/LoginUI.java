package com.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginUI extends JFrame{
    private static JTextField userText;
    private static JPasswordField passwordText;
    private static JButton loginButton;
    private static JButton registerButton;

    public LoginUI() {
        super("登录界面");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        createUI();
    }
    private void createUI() {
        // 创建面板
        JPanel panel = new JPanel();
        panel.setLayout(null);  // 使用 BorderLayout 管理器
        panel.setBackground(new Color(245, 245, 245));

        // 设置字体和颜色
        Font customFont = new Font("楷体", Font.BOLD, 18);
        Color primaryColor = new Color(66, 135, 245);
        Color secondColor = new Color(204, 255, 255);

        // 创建标题标签
        JLabel titleLabel = new JLabel("人事管理系统");
        // 题目设置在中心位置
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setBounds(50, 30, 300, 30);
        titleLabel.setFont(new Font("楷体", Font.BOLD, 24));
        panel.add(titleLabel);


        // 创建标签和文本框
        JLabel userLabel = new JLabel("用户名:");
        userLabel.setBounds(50,100,150,30);
        userLabel.setFont(customFont);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(160, 100, 190, 30);
        userText.setFont(customFont);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("密码:");
        passwordLabel.setBounds(50,150,150,30);
        passwordLabel.setFont(customFont);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(160, 150, 190, 30);
        passwordText.setFont(customFont);
        passwordText.setEchoChar('*');
        panel.add(passwordText);

        // 创建登录按钮
        loginButton = new JButton("登录");
        loginButton.setBounds(50, 200, 150, 30);
        loginButton.setFont(customFont);
        loginButton.setBackground(primaryColor);
        loginButton.setForeground(Color.WHITE);
        panel.add(loginButton);

        registerButton = new JButton("注册");
        registerButton.setBounds(200, 200, 150, 30);
        registerButton.setFont(customFont);
        registerButton.setForeground(Color.BLACK);
        registerButton.setBackground(secondColor);  // 按钮颜色
        panel.add(registerButton);

        // 登录按钮点击事件
//        loginButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String username = userText.getText();
//                char[] password = passwordText.getPassword();
//                JOptionPane.showMessageDialog(frame, "Username: " + username + "\nPassword: " + new String(password)+"\n登录成功!");
//            }
//        });
//
//        // 注册按钮点击事件
//        registerButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String username = userText.getText();
//                char[] password = passwordText.getPassword();
//                JOptionPane.showMessageDialog(this, "Username: " + username + "\nPassword: " + new String(password)+"\n注册成功!");
//            }
//        });

        this.add(panel);
        this.setVisible(true);
    }
}
