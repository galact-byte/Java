package com.it;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 一个简单的拼图游戏
 **/

public class MainFrame1 extends JFrame {
    public static final String IMAGE_PATH = "stone-maze/src/image/";
    private int[][] data = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    private int row;
    private int col;

    public MainFrame1() {
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
                    swap(row, col, row + 1, col);
                    row++;
                }
                break;
            case DOWN:
                if (row > 0 && row < data.length) {
                    swap(row,col, row - 1, col);
                    row--;
                }
                break;
            case LEFT:
                if (col < data.length - 1) {
                    swap(row, col, row, col + 1);
                    col++;
                }
                break;
            case RIGHT:
                if (col > 0 && col < data.length) {
                    swap(row, col, row, col - 1);
                    col--;
                }
                break;
        }
        initImage();

    }

    // 交换拼图
    private void swap(int r1, int c1, int r2, int c2) {
        int temp = data[r1][c1];
        data[r1][c1] = data[r2][c2];
        data[r2][c2] = temp;
    }

    // 初始化随机拼图
    private void initRandomArray() {
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[i].length; j++) {
//                int random = (int) (Math.random() * 4);
//                int temp = data[i][j];
//                data[i][j] = data[random][random];
//                data[random][random] = temp;
//            }
//        }
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            number.add(i);
        }

        do{
            Collections.shuffle(number);
        }while(!isSolvable(number));

//        OUT:
        for (int i = 0,k=0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++,k++) {
                data[i][j] = number.get(k);
                if (data[i][j] == 0) {
                    row = i;
                    col = j;
//                    break OUT;
                }
            }
        }
    }

    // 判断拼图是否可解
    private boolean isSolvable(List<Integer> number) {
        int inversions=0; // 记录逆序数,即列表中某个数前面有多少个比它大的数
        int blankRow=0;   // 记录空白块所在行

        for(int i = 0; i < 16; i++) {
            if(number.get(i)==0){
                blankRow = i / 4;
                continue;
            }
            for(int j = i+1; j < 16; j++) {
                if(number.get(j)!=0&&number.get(i)>number.get(j)) {
                    inversions++;
                }
            }
        }
        return (inversions % 2 == 0 && blankRow % 2 == 1) || (inversions % 2 == 1 && blankRow % 2 == 0);
    }

    // 初始化拼图
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

    // 初始化菜单
    private void initMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("系统菜单");
        JMenuItem restartitem = new JMenuItem("重新开始");
        restartitem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame1.this.dispose();
                new MainFrame();
            }
        });
        JMenuItem exitItem = new JMenuItem("退出游戏");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame1.this.dispose();
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

