package com.ui;

import com.bean.Login_User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class LoginUI extends JFrame implements ActionListener {
    private static JTextField loginNameField;
    private static JPasswordField passwordText;
    private static JButton loginButton;
    private static JButton registerButton;
    private static ArrayList<Login_User> allUsers = new ArrayList<>();


    //    static{
//        allUsers.add(new Login_User("管理员","123456","admin"));
//        allUsers.add(new Login_User("张三","123456","zhangsan"));
//        allUsers.add(new Login_User("李四","123456","lisi"));
//    }
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
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setBounds(50, 30, 300, 30);
        titleLabel.setFont(new Font("楷体", Font.BOLD, 24));
        panel.add(titleLabel);


        // 创建标签和文本框
        JLabel userLabel = new JLabel("用户名:");
        userLabel.setBounds(50, 100, 150, 30);
        userLabel.setFont(customFont);
        panel.add(userLabel);

        loginNameField = new JTextField();
        loginNameField.setBounds(160, 100, 190, 30);
        loginNameField.setFont(customFont);
        panel.add(loginNameField);

        JLabel passwordLabel = new JLabel("密码:");
        passwordLabel.setBounds(50, 150, 150, 30);
        passwordLabel.setFont(customFont);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(160, 150, 190, 30);
        passwordText.setFont(customFont);
        passwordText.setEchoChar('*');
        panel.add(passwordText);

        // 创建登录按钮
        loginButton = new JButton("登录");
        loginButton.setBounds(50, 250, 150, 30);
        loginButton.setFont(customFont);
        loginButton.setBackground(primaryColor);
        loginButton.setForeground(Color.WHITE);
        panel.add(loginButton);
        loginButton.addActionListener(this);

        // 创建注册按钮
        registerButton = new JButton("注册");
        registerButton.setBounds(200, 250, 150, 30);
        registerButton.setFont(customFont);
        registerButton.setForeground(Color.BLACK);
        registerButton.setBackground(secondColor);  // 按钮颜色
        panel.add(registerButton);
        registerButton.addActionListener(this);

        // 登录按钮点击事件
//        loginButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String username = userText.getText();
//                char[] password = passwordText.getPassword();
//
//                if (username.isEmpty() || password.length == 0) {
//                    JOptionPane.showMessageDialog(LoginUI.this, "用户名或密码不能为空");
//                }
//                JOptionPane.showMessageDialog(LoginUI.this, "Username: " + username + "\nPassword: " + new String(password) + "\n登录成功!");
//            }
//        });

        // 注册按钮点击事件
//        registerButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String username = userText.getText();
//                char[] password = passwordText.getPassword();
//
//                if (username.isEmpty() || password.length == 0) {
//                    JOptionPane.showMessageDialog(LoginUI.this, "用户名或密码不能为空");
//                    return;
//                }
//                String loginName = username;
//                Login_User user = new Login_User(username, new String(password), loginName);
//                allUsers.add(user);
//                JOptionPane.showMessageDialog(LoginUI.this, "Username: " + username + "\nPassword: " + new String(password) + "\n注册成功!");
//
//               System.out.println("已注册的用户:");
//               for (Login_User u : allUsers) {
//                   System.out.println(u);
//               }
//            }
//        });

        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            System.out.println("正在登录");
            login();
        } else {
            System.out.println("正在注册");
            register();
        }

    }

    private void register() {
        String loginName = loginNameField.getText();
        String password = new String(passwordText.getPassword());
        if (loginName.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "用户名或密码不能为空");
        }

        Login_User newuser = new Login_User(loginName, password);
        allUsers.add(newuser);
        JOptionPane.showMessageDialog(this, "注册成功!");
        System.out.println("已注册的用户:");
        for (Login_User u : allUsers) {
            System.out.println(u);
        }
        loginNameField.setText("");
        passwordText.setText("");
    }

    private void login() {
        String loginName = loginNameField.getText();
        String password = new String(passwordText.getPassword());
        Login_User user = getUserByLoginName(loginName);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                System.out.println("登录成功");
                new EmployeeManagerUI(user.getLoginName());
                this.dispose(); // 关闭当前窗口
            } else {
                JOptionPane.showMessageDialog(this, "密码错误");
            }
        } else {
            JOptionPane.showMessageDialog(this, "用户不存在");
        }
    }

    private Login_User getUserByLoginName(String loginName) {
        for (Login_User user : allUsers) {
            if (user.getLoginName().equals(loginName)) {
                return user;
            }
        }
        return null;
    }
}
