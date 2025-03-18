package com.it;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * 一个简单的拼图游戏
 * 有很大概率会在最后两块显示无解
 * 逆序数为奇数时无解，逆序数就是当前数字比前面数字大的个数
 */

public class MainFrame extends JFrame {
    public static final String IMAGE_PATH = "stone-maze/src/image/";
    private int[][] data = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    private int[][] windata = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    private int row;
    private int col;
    private int count;

    public MainFrame() {
        initFrame();
        initMenu();
        initRandomArray();
        initImage();
        initKeyPressEvent();
        this.setVisible(true);
    }

    // 初始化按键事件
    private void initKeyPressEvent() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        switchAndMove(Direction.UP);
                        break;
                    case KeyEvent.VK_DOWN:
                        switchAndMove(Direction.DOWN);
                        break;
                    case KeyEvent.VK_LEFT:
                        switchAndMove(Direction.LEFT);
                        break;
                    case KeyEvent.VK_RIGHT:
                        switchAndMove(Direction.RIGHT);
                        break;
                }
            }
        });
    }

    // 移动拼图并判断是否成功
    private void switchAndMove(Direction direction) {
        switch (direction) {
            case UP:
                if (row < data.length - 1) {
                    int temp = data[row][col];
                    data[row][col] = data[row + 1][col];
                    data[row + 1][col] = temp;
                    row++;
                    count++;
                }
                break;
            case DOWN:
                if (row > 0||row< data.length) {
                    int temp = data[row][col];
                    data[row][col] = data[row - 1][col];
                    data[row - 1][col] = temp;
                    row--;
                    count++;
                }
                break;
            case LEFT:
                if(col< data.length-1){
                    int temp = data[row][col];
                    data[row][col] = data[row][col+1];
                    data[row][col+1] = temp;
                    col++;
                    count++;
                }
                break;
            case RIGHT:
                if(col>0||col< data.length){
                    int temp = data[row][col];
                    data[row][col] = data[row][col-1];
                    data[row][col-1] = temp;
                    col--;
                    count++;
                }
                break;
        }
        initImage();

    }

    // 初始化随机拼图
    private void initRandomArray() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                int random = (int) (Math.random() * 4);
                int temp = data[i][j];
                data[i][j] = data[random][random];
                data[random][random] = temp;
            }
        }
        OUT:
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == 0) {
                    row = i;
                    col = j;
                    break OUT;
                }
            }
        }
    }

    // 初始化拼图
    private void initImage() {
        this.getContentPane().removeAll();

        // 刷新界面时可以显示步数
        JLabel countTxt=new JLabel("步数:"+count);
        countTxt.setBounds(20,20,100,20);
        countTxt.setForeground(Color.white);
        this.add(countTxt);

        if(isWin()){
            JLabel win = new JLabel(new ImageIcon(IMAGE_PATH + "win.png"));
            win.setBounds(92, 198, 266, 88);
            this.add(win);
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                JLabel label = new JLabel();
                label.setIcon(new ImageIcon(IMAGE_PATH + data[i][j] + ".png"));
                label.setBounds(20 + j * 100, 60 + i * 100, 100, 100);
                this.add(label);
            }
        }

        JLabel background = new JLabel(new ImageIcon(IMAGE_PATH + "background.png"));
        background.setBounds(0, 0, 450, 484);
        this.add(background);

        this.repaint();
    }

    private boolean isWin() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != windata[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // 初始化菜单
    private void initMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("系统菜单");
        JMenuItem restartitem = new JMenuItem("重新开始");
        restartitem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                MainFrame.this.dispose();
//                new MainFrame();
                initRandomArray();
                initImage();
            }
        });
        JMenuItem exitItem = new JMenuItem("退出游戏");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.this.dispose();
            }
        });
        menu.add(restartitem);
        menu.add(exitItem);
        menuBar.add(menu);
        this.setJMenuBar(menuBar);
    }

    // 初始化窗口
    private void initFrame() {
        this.setTitle("石头迷宫");
        this.setSize(465, 575);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }
}

