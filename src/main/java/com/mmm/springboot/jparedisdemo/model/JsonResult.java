package com.mmm.springboot.jparedisdemo.model;

import com.mmm.springboot.jparedisdemo.utils.CodeEnum;

import java.io.Serializable;

public class JsonResult<T> implements Serializable{
    private Integer code;
    private String message;
    private T data;

    public JsonResult() {

    }

    public JsonResult(CodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
