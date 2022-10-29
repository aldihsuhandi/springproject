package com.project.webproject.facade;

import com.project.webproject.model.Request.user.UserCreateRequest;
import com.project.webproject.model.Request.user.UserUpdateRequest;
import com.project.webproject.model.Result.user.UserCreateResult;
import com.project.webproject.model.Result.user.UserUpdateResult;

public interface UserFacade {
    UserCreateResult create(UserCreateRequest request);

    UserUpdateResult update(UserUpdateRequest request);
}
