package com.project.webproject.executor.processor;

import com.project.webproject.model.Request.BaseRequest;
import com.project.webproject.model.Result.BaseResult;

public interface BaseProcessor {
    void doProcess(BaseRequest request, BaseResult result);
}
