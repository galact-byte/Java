package com.it.exception1;

/**
 * 自定义运行时异常类
 * 1. 继承RuntimeException类
 * 2. 提供无参构造和有参构造
 * 3. 重写父类的方法
 */
public class ItAgeillegalRuntimeException extends RuntimeException{
    public ItAgeillegalRuntimeException() {

    }
    public ItAgeillegalRuntimeException(String message) {
        super(message);
    }
}
