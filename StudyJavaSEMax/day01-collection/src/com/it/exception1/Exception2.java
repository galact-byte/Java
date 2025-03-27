package com.it.exception1;

public class Exception2 {
    public static void main(String[] args) {
        try {
            System.out.println(div(10,0));
        } catch (Exception e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
    public static int div(int a,int b) throws Exception {
        if(b==0){
            throw new Exception("除数不能为0");
        }
        int result = a/b;
        return result;
    }
}
