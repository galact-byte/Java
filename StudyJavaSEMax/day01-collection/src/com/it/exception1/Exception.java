package com.it.exception1;

public class Exception  {
    public static void main(String[] args) {
        show();
    }

    // 运行时异常
    private static void show() {
        System.out.println("show方法开始");
        // 数组索引越界异常
        int[] arr= {1,2,3};
//        System.out.println(arr[3]);

        // 空指针异常
        String str = null;
        System.out.println(str.length());
        System.out.println(str);
    }
}
