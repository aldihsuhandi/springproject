package com.project.webproject.executor.validator.user;

import com.project.webproject.executor.validator.BaseValidator;
import com.project.webproject.model.Request.BaseRequest;
import com.project.webproject.model.Request.user.UserCreateRequest;
import com.project.webproject.utility.checker.ParamChecker;
import com.project.webproject.utility.exception.SpringException;

public class UserCreateValidator implements BaseValidator {
    @Override
    public void validate(BaseRequest request) throws SpringException {

        ParamChecker.isNotNull(request, "request");

        UserCreateRequest userCreateRequest = (UserCreateRequest) request;

        ParamChecker.isNotEmpty(userCreateRequest.getEmail(), "email");
        ParamChecker.isNotEmpty(userCreateRequest.getUsername(), "username");
        ParamChecker.isNotEmpty(userCreateRequest.getPassword(), "password");

        ParamChecker.isEmail(userCreateRequest.getEmail(), "email");
        ParamChecker.isAlphaNumeric(userCreateRequest.getPassword(), "password");
    }
}
