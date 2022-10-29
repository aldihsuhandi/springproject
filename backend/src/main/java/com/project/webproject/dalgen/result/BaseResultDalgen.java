package com.project.webproject.dalgen.result;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResultDalgen {
    private boolean success;
    private String errorCode;
    private String errorMsg;
}
