package com.mmm.springboot.jparedisdemo.exception;

import com.mmm.springboot.jparedisdemo.model.JsonResult;
import com.mmm.springboot.jparedisdemo.utils.JsonResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public JsonResult toEncapsulateResult(Object object){
        if(object instanceof LogException){
            return JsonResultUtil.returnResultByLogException((LogException) object);
        }
        return JsonResultUtil.returnUnknownErrorResult();
    }
}
