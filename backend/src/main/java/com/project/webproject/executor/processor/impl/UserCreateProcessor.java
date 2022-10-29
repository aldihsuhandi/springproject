package com.project.webproject.executor.processor.impl;

import com.project.webproject.executor.processor.BaseProcessor;
import com.project.webproject.model.Request.BaseRequest;
import com.project.webproject.model.Request.user.UserCreateRequest;
import com.project.webproject.model.Result.BaseResult;
import com.project.webproject.service.UserService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Setter
public class UserCreateProcessor implements BaseProcessor {

    @Autowired
    private UserService userService;

    @Override
    public void doProcess(BaseRequest request, BaseResult result) {
        UserCreateRequest userCreateRequest = (UserCreateRequest) request;
        userCreateRequest.setPassword(userService.encryptPassword(userCreateRequest.getPassword()));

        result = userService.create(userCreateRequest);
    }
}
