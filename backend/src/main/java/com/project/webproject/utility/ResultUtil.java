package com.project.webproject.utility;

import com.project.webproject.model.Result.BaseResult;
import com.project.webproject.utility.exception.SpringException;

public class ResultUtil {
    public static void buildResult(BaseResult result, boolean isSuccess, SpringException exception) {
        result.setSuccess(isSuccess);
        if (exception != null) {
            result.setErrorCode(exception.getErrorCode().getErrorCode());
            result.setErrorMsg(exception.getMessage());
        }
    }
}
