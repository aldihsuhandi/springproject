package com.project.webproject.executor;

import com.project.webproject.executor.processor.BaseProcessor;
import com.project.webproject.executor.validator.BaseValidator;
import com.project.webproject.model.Request.BaseRequest;
import com.project.webproject.model.Result.BaseResult;
import com.project.webproject.utility.Enum.ProcessEnum;

import java.util.Map;

public class ProcessorExecutor {
    protected Map<String, BaseValidator> validators;
    protected Map<String, BaseProcessor> processors;

    public void doProcess(ProcessEnum processEnum, BaseRequest request, BaseResult result) throws Exception {
        validators.get(processEnum.getProcessName()).validate(request);

        processors.get(processEnum.getProcessName()).doProcess(request, result);
    }
}
