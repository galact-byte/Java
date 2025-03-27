package com.it.exception1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exception1 {
    public static void main(String[] args) {
        show();
        try {
            show2();
        } catch (java.lang.Exception e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }

//        try {
//            // 监视代码，出现异常，会被catch拦截到
//            show2();
//        } catch (ParseException e) {
////            throw new RuntimeException(e);
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
////            throw new RuntimeException(e);
//            e.printStackTrace();
//        }

    }

    // 编译时异常
//    private static void show2() throws ParseException, FileNotFoundException {
//        System.out.println("show2方法开始");
//        String str = "2025-03-24 22:42:10";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = sdf.parse(str);  // 提醒这里容易出bug
//        System.out.println(date);
//
//        InputStream is = new FileInputStream("D:/1.png");
//        System.out.println("show2方法结束");
//    }
    private static void show2() throws java.lang.Exception {
        System.out.println("show2方法开始");
        String str = "2025-03-24 22:42:10";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);  // 提醒这里容易出bug
        System.out.println(date);

        InputStream is = new FileInputStream("D:/1.png");
        System.out.println("show2方法结束");
    }

    // 运行时异常
    private static void show() {
        System.out.println("show方法开始");
        // 数组索引越界异常
        int[] arr = {1, 2, 3};
//        System.out.println(arr[3]);

        // 空指针异常
        String str = null;
        System.out.println(str.length());
        System.out.println(str);
    }
}
