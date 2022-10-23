package com.project.webproject.utility.converter.request;

import com.project.webproject.model.Request.user.UserCreateRequest;
import com.project.webproject.utility.JSONUtil;
import com.project.webproject.utility.constant.UserRequestConst;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public class UserRequestConverter {
    public static UserCreateRequest convertCreateRequest(String jsonString) {
        UserCreateRequest request = new UserCreateRequest();
        JSONObject requestJson = JSONUtil.parse(jsonString);
        if (requestJson == null) {
            return null;
        }

        request.setEmail(JSONUtil.getString(requestJson, UserRequestConst.EMAIL));
        request.setPassword(JSONUtil.getString(requestJson, UserRequestConst.PASSWORD));
        request.setUsername(JSONUtil.getString(requestJson, UserRequestConst.USERNAME));
        request.setProfilePicture(JSONUtil.getString(requestJson, UserRequestConst.PROFILE_PICTURE));

        return request;
    }
}
