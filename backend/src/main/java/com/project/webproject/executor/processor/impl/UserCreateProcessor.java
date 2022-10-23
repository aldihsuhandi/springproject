package com.project.webproject.executor.processor.impl;

import com.project.webproject.executor.processor.BaseProcessor;
import com.project.webproject.model.Request.BaseRequest;
import com.project.webproject.model.Request.user.UserCreateRequest;
import com.project.webproject.model.Result.BaseResult;
import com.project.webproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserCreateProcessor implements BaseProcessor {

    @Autowired
    UserService userService;

    @Override
    public void doProcess(BaseRequest request, BaseResult result) {
        UserCreateRequest userCreateRequest = (UserCreateRequest) request;
        result = userService.create(userCreateRequest);
    }
}
