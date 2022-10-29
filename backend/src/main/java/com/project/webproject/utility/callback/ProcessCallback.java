package com.project.webproject.utility.callback;

import com.project.webproject.model.Result.BaseResult;
import com.project.webproject.utility.Enum.ErrorCodeEnum;
import com.project.webproject.utility.ResultUtil;
import com.project.webproject.utility.exception.SpringException;

public abstract class ProcessCallback {
    public BaseResult result;

    public abstract void process() throws Exception;

    public abstract BaseResult initResult();

    public Object execute() {
        result = initResult();

        try {
            process();
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
