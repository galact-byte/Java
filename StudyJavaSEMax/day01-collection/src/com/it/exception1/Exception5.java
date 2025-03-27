package com.it.exception1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exception5 {
    public static void main(String[] args) {
        try {
            show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void show() throws Exception {
        System.out.println("show方法开始");
        String str = "2025-03-24 22:42:10";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);  // 提醒这里容易出bug
        System.out.println(date);

        InputStream is = new FileInputStream("D:/1.png");
        System.out.println("show方法结束");
    }
}
