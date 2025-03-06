package com.ui;

import com.bean.Employee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class AddEmployeeUI extends JFrame {
    private JTextField txtId, txtName, txtSex, txtAge, txtPhone, txtJob, txtEntryTime, txtSalary, txtDepartment;
    private JFormattedTextField txtHireDate;
    private JButton btnSave, btnCancel;
    private EmployeeManagerUI parent;

    public AddEmployeeUI(EmployeeManagerUI parent) {
        super("添加员工信息");
        this.parent = parent;
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        Font labelFont = new Font("宋体", Font.BOLD, 14);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblId = new JLabel("编号：");
        lblId.setFont(labelFont);
        add(lblId, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtId = new JTextField(10);
        add(txtId, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel lblName = new JLabel("姓名：");
        lblName.setFont(labelFont);
        add(lblName, gbc);

        gbc.gridx = 1;
        txtName = new JTextField(10);
        add(txtName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel lblGender = new JLabel("性别：");
        lblGender.setFont(labelFont);
        add(lblGender, gbc);

        gbc.gridx = 1;
        txtSex = new JTextField(10);
        add(txtSex, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        JLabel lblAge = new JLabel("年龄：");
        lblAge.setFont(labelFont);
        add(lblAge, gbc);

        gbc.gridx = 1;
        txtAge = new JTextField(10);
        add(txtAge, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        JLabel lblPhone = new JLabel("电话：");
        lblPhone.setFont(labelFont);
        add(lblPhone, gbc);

        gbc.gridx = 1;
        txtPhone = new JTextField(10);
        add(txtPhone, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        JLabel lblJob = new JLabel("职位：");
        lblJob.setFont(labelFont);
        add(lblJob, gbc);

        gbc.gridx = 1;
        txtJob = new JTextField(10);
        add(txtJob, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        JLabel lblEntryTime = new JLabel("入职时间：");
        lblEntryTime.setFont(labelFont);
        add(lblEntryTime, gbc);

        gbc.gridx = 1;
        txtEntryTime = new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd"));
        add(txtEntryTime, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        JLabel lblSalary = new JLabel("工资：");
        lblSalary.setFont(labelFont);
        add(lblSalary, gbc);

        gbc.gridx = 1;
        txtSalary = new JTextField(10);
        add(txtSalary, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        JLabel lblDepartment = new JLabel("部门：");
        lblDepartment.setFont(labelFont);
        add(lblDepartment, gbc);

        gbc.gridx = 1;
        txtDepartment = new JTextField(10);
        add(txtDepartment, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        btnSave = new JButton("保存");
        btnCancel = new JButton("取消");
        btnSave.setPreferredSize(new Dimension(100, 30));
        btnCancel.setPreferredSize(new Dimension(100, 30));
        JPanel btnPanel = new JPanel();
        btnPanel.add(btnSave);
        btnPanel.add(btnCancel);
        add(btnPanel, gbc);

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Employee emp = new Employee();
                emp.setId(Integer.parseInt(txtId.getText()));
                emp.setName(txtName.getText());
                emp.setGender(txtSex.getText());
                emp.setAge(Integer.parseInt(txtAge.getText()));
                emp.setPhone(txtPhone.getText());
                emp.setJob(txtJob.getText());
                emp.setEntryTime(txtEntryTime.getText());
                emp.setSalary(Double.parseDouble(txtSalary.getText()));
                emp.setDepartment(txtDepartment.getText());

                parent.addEmployee(emp);
                JOptionPane.showMessageDialog(AddEmployeeUI.this, "添加成功!");
                AddEmployeeUI.this.dispose();

            }
        });

        pack();
        setSize(300, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
