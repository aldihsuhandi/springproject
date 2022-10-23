package com.project.webproject.utility.Enum;

import lombok.Getter;

public enum ErrorCodeEnum {

    SYSTEM_ERROR("SYSTEM_ERROR", "system experienced an error");

    @Getter
    private final String errorCode;
    @Getter
    private final String errorMsg;

    ErrorCodeEnum(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
