package com.project.webproject.model.Result;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResult {
    private boolean success;
    private String errorCode;
    private String errorMsg;
}
