package com.it.enums;

public class Test {
    public static void main(String[] args) {
        move(Direction.Up);
    }
    public static void move(Direction d){
        switch (d){
            case Up:
                System.out.println("向上移动");
                break;
            case Direction.Down:
                System.out.println("向下移动");
                break;
            case Direction.Left:
                System.out.println("向左移动");
                break;
            case Direction.Right:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
