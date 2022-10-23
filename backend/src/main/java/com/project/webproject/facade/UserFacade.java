package com.project.webproject.facade;

import com.project.webproject.model.Request.user.UserCreateRequest;
import com.project.webproject.model.Result.user.UserCreateResult;

public interface UserFacade {
    UserCreateResult create(UserCreateRequest request);
}
