package com.ui;

import com.Services.EmployeeManager;
import com.bean.Employee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeManagementUI {
    private JFrame frame;
    private JTextField idField, nameField, genderField, ageField, phoneField, jobField, entryTimeField, salaryField, departmentField;
    private JTextArea employeeListArea;
    private EmployeeManager employeeManager;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                EmployeeManagementUI window = new EmployeeManagementUI();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public EmployeeManagementUI() {
        employeeManager = new EmployeeManager();
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        panel.setLayout(new GridLayout(5, 4));

        panel.add(new JLabel("工号"));
        idField = new JTextField();
        panel.add(idField);

        panel.add(new JLabel("姓名"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("性别"));
        genderField = new JTextField();
        panel.add(genderField);

        panel.add(new JLabel("年龄"));
        ageField = new JTextField();
        panel.add(ageField);

        panel.add(new JLabel("电话"));
        phoneField = new JTextField();
        panel.add(phoneField);

        panel.add(new JLabel("职位"));
        jobField = new JTextField();
        panel.add(jobField);

        panel.add(new JLabel("入职时间"));
        entryTimeField = new JTextField();
        panel.add(entryTimeField);

        panel.add(new JLabel("工资"));
        salaryField = new JTextField();
        panel.add(salaryField);

        panel.add(new JLabel("部门"));
        departmentField = new JTextField();
        panel.add(departmentField);

        JPanel buttonPanel = new JPanel();
        frame.add(buttonPanel, BorderLayout.SOUTH);

        JButton addButton = new JButton("添加员工");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addEmployee();
            }
        });
        buttonPanel.add(addButton);

        JButton deleteButton = new JButton("删除员工");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteEmployee();
            }
        });
        buttonPanel.add(deleteButton);

        JButton updateButton = new JButton("修改员工");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEmployee();
            }
        });
        buttonPanel.add(updateButton);

        JButton queryButton = new JButton("查询员工");
        queryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                queryEmployee();
            }
        });
        buttonPanel.add(queryButton);

        employeeListArea = new JTextArea();
        employeeListArea.setEditable(true);
        JScrollPane scrollPane = new JScrollPane(employeeListArea);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    private void addEmployee() {
        try {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            String gender = genderField.getText();
            int age = Integer.parseInt(ageField.getText());
            String phone = phoneField.getText();
            String job = jobField.getText();
            String entryTime = entryTimeField.getText();
            double salary = Double.parseDouble(salaryField.getText());
            String department = departmentField.getText();

            Employee employee = new Employee(id, name, gender, age, phone, job, entryTime, salary, department);
            employeeManager.addEmployee(employee);
            displayEmployeeList();
            clearInputFields();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "请输入正确的信息");
        }
    }

    private void deleteEmployee() {
        String id = JOptionPane.showInputDialog(frame, "请输入要删除的员工ID:");
        if (id != null && !id.isEmpty()) {
            boolean success = employeeManager.deleteEmployee(Integer.parseInt(id));
            if (success) {
                JOptionPane.showMessageDialog(frame, "删除成功");
                displayEmployeeList();
            }else{
                JOptionPane.showMessageDialog(frame, "删除失败");
            }
        }
    }
    private void updateEmployee() {
        String id = JOptionPane.showInputDialog(frame, "请输入要更新的员工ID:");
        if (id != null && !id.isEmpty()) {
            Employee existingEmployee = employeeManager.queryEmployee(Integer.parseInt(id));
            if (existingEmployee != null) {
                Employee updatedEmployee = new Employee(
                        Integer.parseInt(id),
                        JOptionPane.showInputDialog(frame, "请修改员工姓名", existingEmployee.getName()),
                        JOptionPane.showInputDialog(frame, "请修改员工性别", existingEmployee.getGender()),
                        Integer.parseInt(JOptionPane.showInputDialog(frame, "请修改员工年龄", existingEmployee.getAge())),
                        JOptionPane.showInputDialog(frame, "请修改员工电话", existingEmployee.getPhone()),
                        JOptionPane.showInputDialog(frame, "请修改员工职位", existingEmployee.getJob()),
                        JOptionPane.showInputDialog(frame, "请修改员工入职时间", existingEmployee.getEntryTime()),
                        Double.parseDouble(JOptionPane.showInputDialog(frame, "请修改员工工资", existingEmployee.getSalary())),
                        JOptionPane.showInputDialog(frame, "请修改员工部门", existingEmployee.getDepartment())
                );
                boolean success = employeeManager.updateEmployee(Integer.parseInt(id), updatedEmployee);
                if (success) {
                    JOptionPane.showMessageDialog(frame, "员工信息修改成功");
                    displayEmployeeList();
                }else{
                    JOptionPane.showMessageDialog(frame, "员工信息修改失败");
                }
            }else{
                JOptionPane.showMessageDialog(frame, "未找到该员工");
            }
        }
    }
    private void queryEmployee() {
        String id = JOptionPane.showInputDialog(frame, "请输入要查询的员工ID");
        if (id != null && !id.isEmpty()){
            Employee employee = employeeManager.queryEmployee(Integer.parseInt(id));
            if (employee != null){
                JOptionPane.showMessageDialog(frame, "员工信息:\n" + employee.toString());
            }else{
                JOptionPane.showMessageDialog(frame, "未找到该员工");
            }
        }
    }
    private void displayEmployeeList() {
        employeeListArea.setText("");
        for (Employee employee : employeeManager.getEmployeeList()) {
            employeeListArea.append(employee.toString() + "\n");
        }
    }

    private void clearInputFields() {
        idField.setText("");
        nameField.setText("");
        genderField.setText("");
        ageField.setText("");
        phoneField.setText("");
        jobField.setText("");
        entryTimeField.setText("");
        salaryField.setText("");
        departmentField.setText("");
    }
}
