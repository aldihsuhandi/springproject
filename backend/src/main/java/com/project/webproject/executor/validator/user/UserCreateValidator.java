package com.project.webproject.executor.validator.user;

import com.project.webproject.executor.validator.BaseValidator;
import com.project.webproject.model.Request.BaseRequest;
import com.project.webproject.model.Request.user.UserCreateRequest;
import com.project.webproject.utility.exception.SpringException;

public class UserCreateValidator implements BaseValidator {
    @Override
    public void validate(BaseRequest request) throws SpringException {
        UserCreateRequest userCreateRequest = (UserCreateRequest) request;
    }
}
