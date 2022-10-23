package com.project.webproject.facade.impl;

import com.project.webproject.facade.BaseFacade;
import com.project.webproject.facade.UserFacade;
import com.project.webproject.model.Request.user.UserCreateRequest;
import com.project.webproject.model.Result.user.UserCreateResult;
import com.project.webproject.utility.Enum.ErrorCodeEnum;
import com.project.webproject.utility.Enum.ProcessEnum;
import com.project.webproject.utility.ResultUtil;
import com.project.webproject.utility.exception.SpringException;

public class UserFacadeImpl extends BaseFacade implements UserFacade {

    @Override
    public UserCreateResult create(UserCreateRequest request) {
        UserCreateResult result = new UserCreateResult();
        try {
            processorExecutor.doProcess(ProcessEnum.REGISTER_USER, request, result);
        } catch (Exception e) {
            SpringException springException = new SpringException(e.getMessage(), e.getCause(), ErrorCodeEnum.SYSTEM_ERROR);
            if (e instanceof SpringException) {
                springException = (SpringException) e;
            }

            ResultUtil.buildResult(result, false, springException);
        }

        return result;
    }
}
