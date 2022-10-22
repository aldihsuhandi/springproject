package com.project.webproject.utility.Enum;

import lombok.Getter;

@Getter
public enum ProcessEnum {
    REGISTER_USER("REGISTER_USER", "160000001", "user register");

    private final String processName;
    private final String processCode;
    private final String description;

    ProcessEnum(String processName, String processCode, String description) {
        this.processName = processName;
        this.processCode = processCode;
        this.description = description;
    }
}