package com.it.springboot.pojo;

import org.springframework.http.HttpStatus;

public class ResponseMessage<T> {
    private T data;
    private String message;
    private int code;

    public ResponseMessage(T data, String message, int code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }
    //接口请求成功
    public static <T> ResponseMessage<T> success(T data){
        return new ResponseMessage<T>(data,"请求成功", HttpStatus.OK.value());
    }
    public static <T> ResponseMessage<T> success(){
        return new ResponseMessage<T>(null,"请求成功", HttpStatus.OK.value());
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
