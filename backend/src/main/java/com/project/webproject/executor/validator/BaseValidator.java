package com.project.webproject.executor.validator;

import com.project.webproject.model.Request.BaseRequest;
import com.project.webproject.utility.exception.SpringException;

public interface BaseValidator {
    void validate(BaseRequest request) throws SpringException;
}
