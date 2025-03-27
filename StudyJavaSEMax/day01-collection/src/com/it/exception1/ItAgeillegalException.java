package com.it.exception1;

/**
 * 自定义编译时异常
 * 1. 继承Exception类
 * 2. 提供无参构造和有参构造
 * 3. 重写父类的方法
 */
public class ItAgeillegalException extends Exception{
    public ItAgeillegalException() {

    }
    public ItAgeillegalException(String message) {
        super(message);
    }
}
