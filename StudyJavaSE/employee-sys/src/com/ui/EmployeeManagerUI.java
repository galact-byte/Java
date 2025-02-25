package com.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EmployeeManagerUI {
    private JFrame frame;
    private JTable table;
    private DefaultTableModel model;
    private JTextField textFieldSearch;

    public static void main(String[] args) {
        EmployeeManagerUI window = new EmployeeManagerUI();
        window.frame.setVisible(true);
    }

    public EmployeeManagerUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        textFieldSearch = new JTextField(20);
        JButton btnSearch = new JButton("搜索");
        JButton btnAdd = new JButton("添加");
        topPanel.add(textFieldSearch);
        topPanel.add(btnSearch);
        topPanel.add(btnAdd);

        model = new DefaultTableModel(new Object[][]{},
                new String[]{"ID", "姓名", "性别", "年龄", "电话", "职位", "入职时间", "工资", "部门"}) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setRowHeight(30);

        for (int i = 0; i < 20; i++) {
            model.addRow(new Object[]{i + 1, "姓名" + (i + 1), "性别" + (i + 1), "年龄" + (i + 1), "电话" + (i + 1), "职位" + (i + 1), "入职时间" + (i + 1), "工资" + (i + 1), "部门" + (i + 1)});
        }

        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem menuItemEdit = new JMenuItem("编辑");
        JMenuItem menuItemDelete = new JMenuItem("删除");
        popupMenu.add(menuItemEdit);
        popupMenu.add(menuItemDelete);
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton()== MouseEvent.BUTTON3) {
                    int row = table.rowAtPoint(e.getPoint());
                    if (row >= 0) {
                        table.setRowSelectionInterval(row, row);
                        popupMenu.show(table, e.getX(), e.getY());
                    }
                }
            }
        });
        menuItemEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    int id = (Integer)model.getValueAt(selectedRow, 0);
//                    System.out.println("编辑ID:"+id);
                    JOptionPane.showMessageDialog(frame, "编辑ID:"+id);
                }
            }
        });
        menuItemDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    int id = (Integer)model.getValueAt(selectedRow, 0);
//                    System.out.println("删除ID:"+id);
                    JOptionPane.showMessageDialog(frame, "删除ID:"+id);
                }
            }
        });

        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchText = textFieldSearch.getText();
                // 进行搜索逻辑处理
            }
        });

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });

        frame.getContentPane().add(topPanel, BorderLayout.NORTH);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
    }
}
