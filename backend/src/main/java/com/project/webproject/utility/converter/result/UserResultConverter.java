package com.project.webproject.utility.converter.result;

import com.project.webproject.model.Result.user.UserCreateResult;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public class UserResultConverter extends BaseResultConverter {
    public static JSONObject convertCreateResult(UserCreateResult result) {
        JSONObject json = new JSONObject();
        buildBaseResult(result, json);

        return json;
    }
}
