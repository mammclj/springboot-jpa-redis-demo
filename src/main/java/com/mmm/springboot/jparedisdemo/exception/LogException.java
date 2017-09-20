package com.mmm.springboot.jparedisdemo.exception;

import com.mmm.springboot.jparedisdemo.utils.CodeEnum;

public class LogException extends RuntimeException{
    private Integer code;



    public LogException(CodeEnum codeEnum){
        super(codeEnum.getMessage());
        this.code = codeEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
