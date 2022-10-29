package com.project.webproject.controller.impl;

import com.project.webproject.controller.UserController;
import com.project.webproject.facade.UserFacade;
import com.project.webproject.model.Request.user.UserCreateRequest;
import com.project.webproject.model.Request.user.UserUpdateRequest;
import com.project.webproject.model.Result.user.UserCreateResult;
import com.project.webproject.utility.JSONUtil;
import com.project.webproject.utility.converter.request.UserRequestConverter;
import com.project.webproject.utility.converter.result.UserResultConverter;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public class UserControllerImpl implements UserController {

    UserFacade userFacade;

    @Override
    public String create(String request) {
        UserCreateRequest userCreateRequest = UserRequestConverter.convertCreateRequest(request);
        UserCreateResult userCreateResult = userFacade.create(userCreateRequest);
        JSONObject resultJson = UserResultConverter.convertCreateResult(userCreateResult);
        return JSONUtil.convertToString(resultJson);
    }

    @Override
    public String update(String request) {
        UserUpdateRequest userUpdateRequest = UserRequestConverter.convertUpdateRequest(request);
        return null;
    }
}
