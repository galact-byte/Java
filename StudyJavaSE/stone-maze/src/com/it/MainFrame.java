package com.it;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainFrame extends JFrame {
    public static final String IMAGE_PATH = "stone-maze/src/image/";
    private int[][] data = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    private int row;
    private int col;

    public MainFrame() {
        initFrame();
        initMenu();
        initRandomArray();
        initImage();
        initKeyPressEvent();
        this.setVisible(true);
    }

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

    private void switchAndMove(Direction direction) {
        switch (direction) {
            case UP:
                if (row < data.length - 1) {
                    int temp = data[row][col];
                    data[row][col] = data[row + 1][col];
                    data[row + 1][col] = temp;
                    row++;
                }
                break;
            case DOWN:
                if (row > 0||row< data.length) {
                    int temp = data[row][col];
                    data[row][col] = data[row - 1][col];
                    data[row - 1][col] = temp;
                    row--;
                }
                break;
            case LEFT:
                if(col< data.length-1){
                    int temp = data[row][col];
                    data[row][col] = data[row][col+1];
                    data[row][col+1] = temp;
                    col++;
                }
                break;
            case RIGHT:
                if(col>0||col< data.length){
                    int temp = data[row][col];
                    data[row][col] = data[row][col-1];
                    data[row][col-1] = temp;
                    col--;
                }
                break;
        }
        initImage();

    }

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

    private void initImage() {
        this.getContentPane().removeAll();
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

    private void initMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("系统菜单");
        JMenuItem restartitem = new JMenuItem("重新开始");
        restartitem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.this.dispose();
                new MainFrame();
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

    private void initFrame() {
        this.setTitle("石头迷宫");
        this.setSize(465, 575);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }
}

