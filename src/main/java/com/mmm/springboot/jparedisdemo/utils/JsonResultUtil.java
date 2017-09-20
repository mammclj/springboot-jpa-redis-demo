package com.mmm.springboot.jparedisdemo.utils;

import com.mmm.springboot.jparedisdemo.exception.LogException;
import com.mmm.springboot.jparedisdemo.model.JsonResult;

public class JsonResultUtil {

    public static JsonResult returnUnknownErrorResult() {
        return new JsonResult(CodeEnum.UNKNOWN_ERROR);
    }
    public static JsonResult returnSuccessResult(Object object) {
        JsonResult jsonResult = new JsonResult(CodeEnum.SUCCESS);
        jsonResult.setData(object);
        return jsonResult;
    }
    public static JsonResult returnResultByLogException(LogException logException) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(logException.getCode());
        jsonResult.setMessage(logException.getMessage());
        jsonResult.setData("");
        return jsonResult;
    }
}
