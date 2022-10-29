package com.project.webproject.facade.impl;

import com.project.webproject.facade.BaseFacade;
import com.project.webproject.facade.UserFacade;
import com.project.webproject.model.Request.user.UserCreateRequest;
import com.project.webproject.model.Request.user.UserUpdateRequest;
import com.project.webproject.model.Result.BaseResult;
import com.project.webproject.model.Result.user.UserCreateResult;
import com.project.webproject.model.Result.user.UserUpdateResult;
import com.project.webproject.utility.Enum.ProcessEnum;
import com.project.webproject.utility.callback.ProcessCallback;

public class UserFacadeImpl extends BaseFacade implements UserFacade {

    @Override
    public UserCreateResult create(UserCreateRequest request) {
        return (UserCreateResult) new ProcessCallback() {
            @Override
            public void process() throws Exception {
                processorExecutor.doProcess(ProcessEnum.REGISTER_USER, request, result);
            }

            @Override
            public BaseResult initResult() {
                return new UserCreateResult();
            }
        }.execute();
    }

    @Override
    public UserUpdateResult update(UserUpdateRequest request) {
        return (UserUpdateResult) new ProcessCallback() {
            @Override
            public void process() throws Exception {
                processorExecutor.doProcess(ProcessEnum.UPDATE_USER, request, result);
            }

            @Override
            public BaseResult initResult() {
                return new UserUpdateResult();
            }
        }.execute();
    }
}
