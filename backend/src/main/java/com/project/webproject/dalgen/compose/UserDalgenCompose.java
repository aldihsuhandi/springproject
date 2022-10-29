package com.project.webproject.dalgen.compose;

import com.project.webproject.dalgen.request.UserRequestDalgen;
import com.project.webproject.dalgen.result.UserResultDalgen;
import com.project.webproject.model.Request.user.UserCreateRequest;
import com.project.webproject.model.Result.user.UserCreateResult;

public class UserDalgenCompose {
    public static UserRequestDalgen composeUserRequestDalgen(UserCreateRequest request) {
        UserRequestDalgen dalgen = new UserRequestDalgen();
        dalgen.setUserId(request.getUserId());
        dalgen.setUsername(request.getUsername());
        dalgen.setEmail(request.getEmail());
        dalgen.setPassword(request.getPassword());
        dalgen.setProfilePicture(request.getProfilePicture());

        return dalgen;
    }

    public static UserCreateResult composeUserResult(UserResultDalgen resultDalgen) {
        UserCreateResult result = new UserCreateResult();
        result.setUserId(resultDalgen.getUserId());
        result.setSuccess(resultDalgen.isSuccess());
        result.setErrorCode(resultDalgen.getErrorCode());
        result.setErrorMsg(resultDalgen.getErrorMsg());

        return result;
    }
}
