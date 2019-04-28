package com.ly.common.exception;

/**
 * @author mfl
 * @date 2019/1/11 09:22
 */
public class MyException extends RuntimeException {

    static final long serialVersionUID = 5422908796650380196L;

    private String code;

    public String getCode() {
        return code;
    }

    public MyException(String code,String message){
        super(message);
        this.code=code;
    }
}
