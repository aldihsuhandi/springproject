package com.project.webproject.executor.processor.impl;

import com.project.webproject.executor.processor.BaseProcessor;
import com.project.webproject.model.Request.BaseRequest;
import com.project.webproject.model.Request.user.UserUpdateRequest;
import com.project.webproject.model.Result.BaseResult;
import com.project.webproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserUpdateProcessor implements BaseProcessor {

    @Autowired
    UserService userService;

    @Override
    public void doProcess(BaseRequest request, BaseResult result) {
        UserUpdateRequest userUpdateRequest = (UserUpdateRequest) request;
        userUpdateRequest.setPassword(userService.encryptPassword(userUpdateRequest.getPassword()));

        result = userService.update(userUpdateRequest);
    }
}
