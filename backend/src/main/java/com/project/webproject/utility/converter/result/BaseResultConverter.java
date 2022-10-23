package com.project.webproject.utility.converter.result;

import com.project.webproject.model.Result.BaseResult;
import com.project.webproject.utility.JSONUtil;
import com.project.webproject.utility.constant.BaseResultConstant;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public class BaseResultConverter {
    protected static void buildBaseResult(BaseResult result, JSONObject resultJson) {
        JSONUtil.put(resultJson, BaseResultConstant.SUCCESS, result.isSuccess());
        JSONUtil.put(resultJson, BaseResultConstant.ERROR_CODE, result.getErrorCode());
        JSONUtil.put(resultJson, BaseResultConstant.ERROR_MSG, result.getErrorMsg());
    }
}
