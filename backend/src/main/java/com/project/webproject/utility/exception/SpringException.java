package com.project.webproject.utility.exception;

import com.project.webproject.utility.Enum.ErrorCodeEnum;
import lombok.Getter;
import lombok.Setter;

public class SpringException extends Exception {
    @Getter
    @Setter
    private ErrorCodeEnum errorCode;

    public SpringException(String message, Throwable cause, ErrorCodeEnum errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }
}
